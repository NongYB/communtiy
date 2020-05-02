package com.nong.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @RequestMapping("Test")
    public String test(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "Test";
    }
}
