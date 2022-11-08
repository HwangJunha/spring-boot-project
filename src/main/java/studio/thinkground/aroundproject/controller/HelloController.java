package studio.thinkground.aroundproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String getHello(){
        return "GET Hello World!";
    }
    @DeleteMapping(value = "/hello")
    public String deleteHello(){
        return "DELETE Hello World!";
    }
    @PostMapping(value = "/hello")
    public String postHello(
    @RequestParam(value = "name", defaultValue = "jun") String name
    ){
        return "POST Hello World!"+" "+name;
    }
    @PutMapping(value = "/hello")
    public String putHello(){
        return "PUT Hello World!";
    }
}
