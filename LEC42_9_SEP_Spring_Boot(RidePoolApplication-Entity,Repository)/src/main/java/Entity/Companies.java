package Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "Companies")
public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Company name cannot be empty")
    @Size(max = 100, message = "Company name must be at most 100 characters")
    private String companyName;

    @NotBlank(message = "Building name cannot be empty")
    @Size(max = 10, message = "Building name must be at most 10 characters")
    private String buildingName;

    @NotBlank(message = "Security in-charge name cannot be empty")
    @Size(max = 30, message = "Security in-charge name must be at most 30 characters")
    private String securityInchargeName;

    @NotBlank(message = "Security help desk number cannot be empty")
    @Pattern(regexp = "^\\d{10}$", message = "Security help desk number must be exactly 10 digits")
    private String securityHelpDeskNumber;
    
    
    //(JsonIgnore)Without it, when you fetch a user (with company), and that company has a list of users (including this user),
    //and so on… it causes infinite recursion or huge nested JSON responses.
    // cascade = CascadeType.ALL - if you made any update operation in companies , it will changes into User-application also.
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<UserApplications> userApplications;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getSecurityInchargeName() {
        return securityInchargeName;
    }

    public void setSecurityInchargeName(String securityInchargeName) {
        this.securityInchargeName = securityInchargeName;
    }

    public String getSecurityHelpDeskNumber() {
        return securityHelpDeskNumber;
    }

    public void setSecurityHelpDeskNumber(String securityHelpDeskNumber) {
        this.securityHelpDeskNumber = securityHelpDeskNumber;
    }

    public List<UserApplications> getUserApplications() {
        return userApplications;
    }

    public void setUserApplications(List<UserApplications> userApplications) {
        this.userApplications = userApplications;
    }
}
