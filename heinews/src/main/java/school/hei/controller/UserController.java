package school.hei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import school.hei.model.User;
import school.hei.service.UserService;

@RestController
public class UserController {

    @Autowired// instanciation automatique de spring
    private UserService userService;

    @GetMapping("/ping")
    public String pingPong(){ return "pong"; }

    //@GetMapping("/students")
    //public List<User> getUsers(){ return userService.getUsers(); }
    
}
