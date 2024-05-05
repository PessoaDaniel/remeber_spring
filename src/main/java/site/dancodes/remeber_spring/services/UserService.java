package site.dancodes.remeber_spring.services;

import site.dancodes.remeber_spring.exceptions.NoProvidedException;
import site.dancodes.remeber_spring.models.User;
import site.dancodes.remeber_spring.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void store(User user) throws NoProvidedException {

        if (user == null) {
            throw new NoProvidedException("User not provided");
        }
        if (user.getName() == null) {
            throw new NoProvidedException("Field name is required");
        }

        if (user.getUserName() == null) {
            throw new NoProvidedException("Field username is required");
        }

        this.userRepository.save(user);
    }
}
