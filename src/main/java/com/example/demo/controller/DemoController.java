package com.example.demo.controller;

import com.example.demo.dto.Demo;
import com.example.demo.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @Autowired
    DemoRepo demoRepo;

    @RequestMapping("/")
    public String getDemo()
    {
        return "demo";
    }

    @RequestMapping("addDemo")
    public String addDemo(Demo demo)
    {
        demoRepo.save(demo);
        return "demo";
    }
}
