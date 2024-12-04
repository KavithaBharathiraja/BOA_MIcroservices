package UserManagementService.Repositories;

import UserManagementService.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
