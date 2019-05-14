package com.jk.util;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HiError implements HelloService {
    @Override
    public String hello(String name) {
        return "sorry I am dont like you";
    }

    @Override
    public User hellouser(User user) {
        User user1 = new User();
        user1.setUserName("i am ksdsk");
        user1.setUserid(1);
        user1.setAge(12);
        user1.setSex(11);
        return null;
    }
}
