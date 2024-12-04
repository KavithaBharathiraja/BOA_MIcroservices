package UserManagementService.Service.Intefaces;

import UserManagementService.Models.UserPersonalInformation;


public interface UserPersonalInfoService {


    UserPersonalInformation saveUser(UserPersonalInformation userPersonalInformation);

    UserPersonalInformation getUserByUsername(String username);

    UserPersonalInformation getUserByEmail(String email);



}
