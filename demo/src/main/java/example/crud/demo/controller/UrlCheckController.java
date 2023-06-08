package example.crud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }
}
