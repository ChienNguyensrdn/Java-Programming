package ut.edu.demojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ut.edu.demojpa.repositories.UserRepository;
import  ut.edu.demojpa.services.UserService;
import ut.edu.demojpa.models.User;
@SpringBootApplication
public class DemojpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemojpaApplication.class, args);

    }

}
