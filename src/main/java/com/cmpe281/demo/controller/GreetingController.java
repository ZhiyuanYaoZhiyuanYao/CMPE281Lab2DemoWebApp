package com.cmpe281.demo.controller;

import com.cmpe281.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Zhiyuan Yao
 */
@Controller
public class GreetingController {

    @PostMapping("greeting")
    public String submit(@ModelAttribute Person person){
        if(person.getName().length() == 0){
            person.setName("visitor");
        }
        return "greeting";
    }


}
