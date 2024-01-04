package com.railscrud.cruddeployedrailway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
@CrossOrigin(origins = "*")
public class ControllerHelloWorld {
    @GetMapping
    public String helloWorld(){
        return "HelloWorld!!!!!!!!";
    }
}
