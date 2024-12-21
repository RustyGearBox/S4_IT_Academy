package cat.itacademy.s04.t01.n02.s04t01n02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/greet1")
    private String greet_1(@RequestParam(value = "name", defaultValue = "Unknown") String name){
        String saludo = "Hello, " + name + ". You are executing a maven project.";
        return saludo;
    }

    @GetMapping("/greet2")
    private String greet_2(@PathVariable(value = "name", required = false) String name){
        String saludo = "Hello, " + name + ". You are executing a maven project.";
        return saludo;
    }

}