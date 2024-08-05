package com.example.demo.http.greetings.service;

import com.example.demo.http.greetings.model.User;

@org.springframework.stereotype.Service
public class Service {
    public String sayHello(User user)
    {
        String welcome="Welcome "+user.getFirstName()+user.getLastName();
        return welcome;
    }

}
