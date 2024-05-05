package site.dancodes.remeber_spring.services;

import site.dancodes.remeber_spring.models.User;
import site.dancodes.remeber_spring.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void store(User user) {
        this.userRepository.save(user);
    }
}
