package mm.db.controller;

import mm.db.model.User;
import mm.db.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/usersByMarquePhone")
    public List<User> getUserByPhoneMarque(@RequestParam String marque){
        List<User> users = userService.UserWhoHavePhoneMarque(marque);
        return users;
    }
}
