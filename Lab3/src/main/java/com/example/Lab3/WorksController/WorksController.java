package com.example.Lab3.WorksController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/our-works")
public class WorksController {
    @GetMapping
    public String index() {
        return "/our-works/our-works";
    }
}