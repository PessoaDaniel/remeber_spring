package site.dancodes.remeber_spring.controller;


import org.springframework.web.bind.annotation.*;
import site.dancodes.remeber_spring.models.User;
import site.dancodes.remeber_spring.repository.UserRepository;
import site.dancodes.remeber_spring.services.UserService;

@RestController()
@RequestMapping("/users")
public class Users {

    UserService userService;

    public Users(UserRepository userRepository) {
        this.userService = new UserService(userRepository);
    }

    @PostMapping(path = "/create", produces = "application/json")
    public String newUsers(@RequestBody User user) {
        try {
            this.userService.store(user);
            return "Sccesfully created User";
        } catch (Exception exception) {
            return "Error: " + exception.getMessage();
        }

    }
}
