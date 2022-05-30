package it.develhope.swaggerProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getWelcome(){
        return "Hello to the localhost:1234/swagger-ui/";
    }
}
