package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("page")
public class Page {

    @RequestMapping("togoodPage")
    public String togoodPage(){
        return "goodPage";
    }
}
