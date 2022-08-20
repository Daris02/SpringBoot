package school.hei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import school.hei.model.User;
import school.hei.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {
    @Autowired // Pour instancier une Interface
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User insertUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deletUser(@PathVariable Long id){
        userService.deletUserById(id);
    }

    @PatchMapping("/user/{id}")
    public void modifyUsser(
        @PathVariable Long id,
        @PathVariable(name = "firstName", required = false) String firstName,
        @PathVariable(name = "lastName", required = false) String lastName,
        @PathVariable(name = "userName", required = false) String userName
    ){
        userService.updateUser(id, firstName, lastName, userName);
    }
}
