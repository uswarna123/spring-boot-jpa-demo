package com.demo.controller;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    DemoService demoService;

    @GetMapping("/getNameById")
    public String getStudentName(){
        return demoService.getName();
    }

}
