package com.cmpe281.demo.controller;

import com.cmpe281.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Zhiyuan Yao
 */
@Controller
public class IndexController {
    @GetMapping({"","/","index"})
    public String getIndexPage(Model model){
        model.addAttribute("person", new Person());
        return "index";
    }
}
