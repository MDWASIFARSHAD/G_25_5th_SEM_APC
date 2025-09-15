
package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Service.UserApplicationsService;
import Entity.Companies;
import Entity.UserApplications;
import Exception_handling.InvalidMotoristRegistration;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-applications")
public class UserApplicationsController {

    @Autowired
    private UserApplicationsService userService;

    public UserApplicationsController(UserApplicationsService userService) {
        this.userService = userService;
    }

    // API 2: Create a new application
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserApplications user) {
        try {
            userService.registerMotorist(user);
            return ResponseEntity.ok("User registration request submitted.");
        } catch (InvalidMotoristRegistration e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
 // API 1: Get list of companies
    @GetMapping("/")
    public ResponseEntity<List<UserApplications>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    

    // API 3: Get application by user ID
    @GetMapping("/by-id/{userId}")
    public ResponseEntity<UserApplications> getUserApplication(@PathVariable Integer userId) {
        Optional<UserApplications> user = userService.getApplicationById(userId);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    // API 4: Get new pending applications
    @GetMapping("/pending")
    public ResponseEntity<List<UserApplications>> getPendingApplications() {
        return ResponseEntity.ok(userService.getPendingApplications());
    }

    // API 5: Approve or reject registration request
    @PostMapping("/{userId}/approve")
    public ResponseEntity<String> approveApplication(@PathVariable Integer userId,
                                                     @RequestParam Integer securityHeadId) {
        userService.approveApplication(userId, securityHeadId);
        return ResponseEntity.ok("User application approved.");
    }


    @PostMapping("/{userId}/reject")
    public ResponseEntity<String> rejectApplication(@PathVariable Integer userId,
                                                    @RequestParam("securityHeadId") Integer securityHeadId) {
        userService.rejectApplication(userId, securityHeadId);
        return ResponseEntity.ok("User application rejected.");
    }
    		
    
}

																																																																																																																																																													