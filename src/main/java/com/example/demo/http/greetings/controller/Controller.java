package com.example.demo.http.greetings.controller;

import com.example.demo.http.greetings.model.User;
import com.example.demo.http.greetings.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/users")
@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/hello/{fname}/{lname}")
    public String sayHello(@PathVariable String fname,@PathVariable String lname)
    {
        User user= new User(fname,lname);
        return service.sayHello(user);
    }

    @GetMapping("/all")
    public List<User> getAll()
    {
     return service.getAll();
    }
}
