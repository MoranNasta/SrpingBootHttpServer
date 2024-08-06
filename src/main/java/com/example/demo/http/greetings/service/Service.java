package com.example.demo.http.greetings.service;

import com.example.demo.http.greetings.model.User;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    public String sayHello(User user)
    {
        String welcome="Welcome "+user.getFirstName()+user.getLastName();
        return welcome;
    }

    public List<User> getAll()
    {
        List<User> allUser=new ArrayList<>();
        for (int i = 0; i < 30000; i++) {
            if (i%2==0)
            {
                User user=new User();
                user.setId(i);
                user.setFirstName("moran"+i);
                user.setLastName("nasta"+i);
                user.setAddress("beirut");
                user.setPhoneNumber(i*84521);
                user.setEmail("morannasta"+i+"@gmmail.com");
                user.setPassed(true);
                user.setLanguage("eng");
                user.setFullName("moran_nasta"+i);
                user.setMiddleName("middle");
                user.setMonth("august");
                user.setTime((int) System.currentTimeMillis());
                user.setType("apple");
                user.setCountry("lebanon");
                user.setHaveHouse(true);
                user.setReligious(true);
                if (i==2) user.setFirst(true);
                else user.setFirst(false);

                if (i==9998) user.setFinished(true);
                else user.setFinished(false);
                if (i%5==0) user.setSmart(true);
                else user.setSmart(false);
                if (i%6==0) user.setAlive(true);
                else user.setAlive(false);

            allUser.add(user);

            }
        }
        return allUser;
    }

}
