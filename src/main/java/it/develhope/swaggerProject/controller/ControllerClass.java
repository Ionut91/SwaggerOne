package it.develhope.swaggerProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class ControllerClass {

    @GetMapping(value = "")
    public String getName(){
        return "My name is Ionut";
    }


}
