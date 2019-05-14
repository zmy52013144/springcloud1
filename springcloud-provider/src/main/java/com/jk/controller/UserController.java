package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public User queryUser(@RequestBody User user){
        System.out.println(user);
        User u = new User();
        u.setUserName("李四");
        u.setAge(2);
        u.setSex(2);
        u.setUserid(2);
        return u;
    }

    @RequestMapping(value = "/helloLiu",method = RequestMethod.POST)
    public User helloLiu(@RequestBody User user){
        System.out.println(user);
        User u1 = new User();
        u1.setUserName("李四1");
        u1.setAge(21);
        u1.setSex(21);
        u1.setUserid(21);
        return u1;
    }
}
