package school.hei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import school.hei.model.User;
import school.hei.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deletUserById(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(Long id, String firstName, String lastName, String userName) {
        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setUserName(userName);

            userRepository.save(user);
        }else{
            throw new IllegalArgumentException("User not found");
        }
    }
}
