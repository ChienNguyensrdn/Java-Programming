package ut.edu.demojpa.services;
import ut.edu.demojpa.models.User;
import ut.edu.demojpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    //Trien khai tiep cac methods save , delete
    //Len lopw trien khai them
    //-->kien thuc hoc tung buoi va tich luy --> Van dap
}
