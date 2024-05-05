package site.dancodes.remeber_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.dancodes.remeber_spring.models.User;

public interface UserRepository  extends JpaRepository<User, String> {}