package ut.edu.demojpa.services;
import ut.edu.demojpa.models.User;
import ut.edu.demojpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public boolean existsByUsername(String username) {
        return true;
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    //Trien khai tiep cac methods save , delete
    //Len lopw trien khai them
    //-->kien thuc hoc tung buoi va tich luy --> Van dap
}
