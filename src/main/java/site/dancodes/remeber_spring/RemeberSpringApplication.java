package site.dancodes.remeber_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing()
public class RemeberSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemeberSpringApplication.class, args);
	}

}
