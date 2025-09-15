package RidePlatform.UserVerfication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"RidePlatform.UserVerfication", "Entity", "Service", "Controller"})
@EntityScan(basePackages = {"Entity"})
@EnableJpaRepositories(basePackages = {"Repository"})
public class UserVerficationApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserVerficationApplication.class, args);
    }
}
