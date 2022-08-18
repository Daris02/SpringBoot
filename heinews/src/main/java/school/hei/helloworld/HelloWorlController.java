package school.hei.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
    
    @GetMapping("/hello/{write}", "/hello/")
    public String helloWorld(@PathVariable(required = false) String write){
        if(write != null)
            return "Hello " + write;
        else
            return "Hello World";
    }
}
