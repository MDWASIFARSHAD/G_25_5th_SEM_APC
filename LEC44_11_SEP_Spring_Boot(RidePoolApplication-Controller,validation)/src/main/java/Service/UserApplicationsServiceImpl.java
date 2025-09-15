package Service;

import Entity.Companies;
import Entity.DrivingLicenses;
import Entity.UserApplications;
import Exception_handling.InvalidMotoristRegistration;
import Exception_handling.UnauthorizedAccessException;
import Repository.DrivingLicensesRepo;
import Repository.UserApplicationsRepo;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserApplicationsServiceImpl implements UserApplicationsService {
    
    @Autowired
    private UserApplicationsRepo userRepo;
    
    @Autowired
    private DrivingLicensesRepo licenseRepo;

    // Constructor for DI (Dependency Injection)
    public UserApplicationsServiceImpl(UserApplicationsRepo userRepo, DrivingLicensesRepo licenseRepo) {
        this.userRepo = userRepo;
        this.licenseRepo = licenseRepo;
    }

    // Register Motorist with Validations
    @Transactional
    @Override
    public void registerMotorist(UserApplications user) {
        if ("Motorist".equalsIgnoreCase(user.getRole())) {
            DrivingLicenses license = user.getDrivingLicense();

            if (license == null) {
                throw new InvalidMotoristRegistration("Motorist must provide a valid driving license.");
            }

            // Set bi-directional relationship
            license.setUser(user);

            // Validate license format
            Pattern pattern = Pattern.compile("^[A-Z]{3}\\d{4}[A-Z]{3}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(license.getLicenseNo().trim());

            if (!matcher.matches()) {
                throw new InvalidMotoristRegistration("Invalid License Format. Must be 3 letters (any case), 4 digits, 3 letters.");
            }

            // Check expiration date
            if (license.getExpirationDate().isBefore(LocalDate.now())) {
                throw new InvalidMotoristRegistration("Driving license is expired.");
            }
        }

        user.setApplicationStatus("Pending");
        userRepo.save(user); // Cascade will save license too
    }

 // API 1: Get list of Users
    public List<UserApplications> getAllUsers() {
        return userRepo.findAll();
    }

    // Get Application by ID
    @Override
    public Optional<UserApplications> getApplicationById(Integer userId) {
        return userRepo.findById(userId);
    }

    // Get Pending Applications
    @Override
    public List<UserApplications> getPendingApplications() {
        return userRepo.findByApplicationStatus("Pending");
    }

    // Approve or Reject Applications
    @Transactional
    public void approveApplication(Integer userId, Integer securityHeadId) {
        Optional<UserApplications> securityHead = userRepo.findById(securityHeadId);

        if (securityHead.isEmpty() || !"SECURITY HEAD".equalsIgnoreCase(securityHead.get().getRole())) {
            throw new UnauthorizedAccessException("Only Security Head can approve applications.");
        }

        Optional<UserApplications> applicant = userRepo.findById(userId);

        if (applicant.isPresent()) {
            applicant.get().setApplicationStatus("Approved");
            userRepo.save(applicant.get());
        } else {
            throw new EntityNotFoundException("User with ID " + userId + " not found.");
        }
    }


    @Transactional
    @Override
    public void rejectApplication(Integer userId, Integer securityHeadId) {
        UserApplications approver = userRepo.findById(securityHeadId)
            .orElseThrow(() -> new RuntimeException("Security Head not found"));

        if (!"SECURITY HEAD".equalsIgnoreCase(approver.getRole())) {
            throw new UnauthorizedAccessException("Only Security Head can reject applications.");
        }

        UserApplications application = userRepo.findById(userId)
            .orElseThrow(() -> new RuntimeException("User application not found"));
    
        application.setApplicationStatus("Rejected");
        userRepo.save(application);
    }
}

