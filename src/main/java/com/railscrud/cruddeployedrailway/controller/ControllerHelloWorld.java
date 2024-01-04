package com.railscrud.cruddeployedrailway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
@CrossOrigin(origins = "https://crud1-production.up.railway.app/swagger-ui.html")
public class ControllerHelloWorld {
    @GetMapping
    public String helloWorld(){
        return "HelloWorld!!!!!!!!";
    }
}
