package school.hei.Testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPong {
    
    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }
}
