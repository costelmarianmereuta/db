package mm.db.service;

import mm.db.model.User;
import mm.db.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> UserWhoHavePhoneMarque(String marque){
        return userRepository.findByTelephone_Marque(marque);
    }
}
