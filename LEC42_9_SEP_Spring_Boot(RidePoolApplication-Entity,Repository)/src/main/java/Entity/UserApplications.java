package Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "UserApplications", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class UserApplications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NotBlank(message = "Username cannot be empty")
    @Size(max = 25, message = "Username must be at most 25 characters")
    @Column(unique = true ,nullable = false)
    private String username;

    @NotBlank(message = "Official email cannot be empty")
    @Email(message = "Invalid email format")
    @Size(max = 50, message = "Email must be at most 50 characters")
    private String officialEmail;

    @NotBlank(message = "Phone number cannot be empty")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits starting with 6-9")
    private String phoneNumber;

    @NotBlank(message = "Designation cannot be empty")
    @Size(max = 50, message = "Designation must be at most 50 characters")
    private String designation;

    @NotBlank(message = "Role cannot be empty")
    private String role;

    private String employeeId;

    @Pattern(regexp = "\\d{12}", message = "Aadhar number must be exactly 12 digits")
    private String aadharNumber;

    @NotBlank(message = "Application status cannot be empty")
    private String applicationStatus;

    @ManyToOne
    @JoinColumn(name = "companyId", referencedColumnName = "id")
    @JsonIgnore
    private Companies company;
    
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private DrivingLicenses drivingLicense;


    // Getters and Setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;    
}
    
    public DrivingLicenses getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicenses drivingLicense) {
        this.drivingLicense = drivingLicense;
        // Set back-reference to maintain consistency
        if (drivingLicense != null) {
            drivingLicense.setUser(this);
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOfficialEmail() {
        return officialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }
}
