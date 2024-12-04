package UserManagementService.Service;

import UserManagementService.Models.UserPersonalInformation;
import UserManagementService.Repositories.UserPersonalInfoRepository;
import UserManagementService.Service.Intefaces.UserPersonalInfoService;
import jakarta.transaction.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class UserPersonalInfoServiceImpl implements UserPersonalInfoService {

    public final UserPersonalInfoRepository userPersonalInfoRepository;

    private final Logger logger = LogManager.getLogger(UserPersonalInfoServiceImpl.class);


    public UserPersonalInfoServiceImpl(UserPersonalInfoRepository userPersonalInfoRepository) {
        this.userPersonalInfoRepository = userPersonalInfoRepository;
    }

    @Override
    @Transactional
    public UserPersonalInformation saveUser(UserPersonalInformation userPersonalInformation) {
        logger.info("Saving user personal information: " + userPersonalInformation.getUsername());
        return userPersonalInfoRepository.save(userPersonalInformation);
    }

    @Override
    @Transactional
    public UserPersonalInformation getUserByUsername(String username) {
        logger.info("Fetching user by username: " + username);
        return userPersonalInfoRepository.findByUsername(username); // Correct method call
    }

    @Override
    @Transactional
    public UserPersonalInformation getUserByEmail(String email) {
        logger.info("Fetching user by email: " + email);
        return userPersonalInfoRepository.findByEmail(email); // Correct method call
    }
}
