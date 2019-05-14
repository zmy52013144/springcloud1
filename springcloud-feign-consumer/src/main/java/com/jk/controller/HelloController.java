package com.jk.controller;

import com.jk.model.User;
import com.jk.service.HelloService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService schedualServiceHi;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.hello(name);
    }

    @RequestMapping(value = "/hello")
    public User hello(@RequestParam String name){

        User user = new User();
        user.setUserid(1);
        user.setUserName("李四1");
        user.setSex(12);
        user.setAge(1);
        return schedualServiceHi.hellouser( user );
    }

    @RequestMapping(value = "/helloLiu")
    public User helloLiu(@RequestParam String name){

        User user = new User();
        user.setUserid(12);
        user.setUserName("李四3");
        user.setSex(121);
        user.setAge(11);
        return userService.hellouserLiu( user );
    }
}
