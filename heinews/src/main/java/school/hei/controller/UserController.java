package school.hei.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.model.User;
import school.hei.repository.UserRepository;

@RestController
public class UserController {
    @Autowired // Pour instancier une Interface
    private UserRepository userRepo;

    @GetMapping("/ping")
    public String pingPong(){ return "pong"; }

    @GetMapping("/users")
    public List<User> getUsers(){ return userRepo.findAll(); }
    
}
