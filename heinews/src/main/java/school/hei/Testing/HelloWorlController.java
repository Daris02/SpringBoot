package school.hei.Testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
    
    @GetMapping("/hello")
    public String helloWorld(@PathVariable(required = false) String write){
        return "Hello World";
    }
}
