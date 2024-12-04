package UserManagementService.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // auto-generated primary key for user

    @Column(unique = true, nullable = false, length = 50)
    private String username; // user’s chosen username

    @Column(unique = true, nullable = false, length = 100)
    private String email; // user’s email address

    @Column(nullable = false)
    private String password_hash; // hashed password for authentication

    @Column(length = 15)
    private String phone_number; // user’s phone number, optional

    @Column(name = "two_factor_enabled", nullable = false)
    private Boolean two_factor_enabled = false; // whether 2FA is enabled

    @Column(name = "kyc_status", nullable = false, length = 20)
    private String kyc_status = "pending"; // user’s KYC status

    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at = LocalDateTime.now(); // when the user profile was created

    @Column(name = "updated_at")
    private LocalDateTime updated_at = LocalDateTime.now(); // when the user profile was last updated
}
