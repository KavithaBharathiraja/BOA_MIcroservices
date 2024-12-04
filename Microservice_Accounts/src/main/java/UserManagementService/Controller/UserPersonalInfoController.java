package UserManagementService.Controller;

import UserManagementService.Models.UserPersonalInformation;
import UserManagementService.Service.UserPersonalInfoServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class UserPersonalInfoController {

    private final UserPersonalInfoServiceImpl userPersonalInfoServiceImpl;

    private static final Logger logger = LogManager.getLogger(UserPersonalInfoController.class);

    public UserPersonalInfoController(UserPersonalInfoServiceImpl userPersonalInfoServiceImpl) {
        this.userPersonalInfoServiceImpl = userPersonalInfoServiceImpl;
    }

    @PostMapping("/user_info")
    public ResponseEntity<UserPersonalInformation> saveUser(@RequestBody UserPersonalInformation userPersonalInformation) {
        return new ResponseEntity<>(userPersonalInfoServiceImpl.saveUser(userPersonalInformation), OK);
    }

    @GetMapping("/user_info/username/{username}")
    public ResponseEntity<UserPersonalInformation> getUserByUsername(@PathVariable String username) {
        UserPersonalInformation user = userPersonalInfoServiceImpl.getUserByUsername(username);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/user_info/email/{email}")
    public ResponseEntity<UserPersonalInformation> getUserByEmail(@PathVariable String email) {
        UserPersonalInformation user = userPersonalInfoServiceImpl.getUserByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
