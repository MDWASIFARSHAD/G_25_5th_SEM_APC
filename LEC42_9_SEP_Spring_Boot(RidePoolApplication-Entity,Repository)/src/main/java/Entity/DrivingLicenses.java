package Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DrivingLicenses")
public class DrivingLicenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "License number cannot be empty")
    @Pattern(regexp = "^[A-Z]{3}\\d{4}[A-Z]{3}$", message = "License number must be in format 3 letters, 4 digits, 3 letters (e.g., ABC1234XYZ)")
    private String licenseNo;

    @NotNull(message = "Expiration date cannot be empty")
    private LocalDate expirationDate;

    @NotBlank(message = "RTA cannot be empty")
    @Size(max = 20, message = "RTA must be at most 20 characters")
    private String rta;

    @NotBlank(message = "Allowed vehicles cannot be empty")
    @Size(max = 100, message = "Allowed vehicles must be at most 100 characters")
    private String allowedVehicles;

    @OneToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private UserApplications user;


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRta() {
        return rta;
    }

    public void setRta(String rta) {
        this.rta = rta;
    }

    public String getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(String allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public UserApplications getUser() {
        return user;
    }

    public void setUser(UserApplications user) {
        this.user = user;
    }
}
