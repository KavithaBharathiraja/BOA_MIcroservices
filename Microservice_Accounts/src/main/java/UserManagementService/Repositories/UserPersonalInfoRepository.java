package UserManagementService.Repositories;

import UserManagementService.Models.UserPersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersonalInfoRepository extends JpaRepository<UserPersonalInformation, Long> {

    // Custom methods for querying by username or email
    UserPersonalInformation findByUsername(String username);
    UserPersonalInformation findByEmail(String email);

}
