package UserManagementService.Service.Intefaces;

import UserManagementService.Models.User;

import java.util.List;

public interface UserService {

   User createUser(User user);

    List<User> getAllUsers();

    User updateUser(User user);

    boolean deleteUser(Long id);


}
