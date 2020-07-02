package rest_example;

import entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World!+";
    }

    @PostMapping
    public String goodBuy(@RequestBody User user){

        return "Good buy " + user.getName()  + ", age " + user.getAge() + " 2020!";
    }
}
