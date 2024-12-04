package UserManagementService.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_personal_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "phone_number", unique = true, length = 15)
    private String phoneNumber;

    @Column(name = "two_factor_enabled", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean twoFactorEnabled = false;

    @Column(name = "kyc_status", columnDefinition = "VARCHAR(20) DEFAULT 'pending'")
    private String kycStatus = "pending";

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;



}
