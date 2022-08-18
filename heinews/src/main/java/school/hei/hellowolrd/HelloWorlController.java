package school.hei.hellowolrd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
    
    @GetMapping("/")
    public String helloWorld(){
        return "Hello Spring Boot!";
    }
}
