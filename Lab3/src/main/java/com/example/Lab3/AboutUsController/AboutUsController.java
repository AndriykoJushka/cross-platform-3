package com.example.Lab3.AboutUsController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutUsController {
    @GetMapping
    public String index() {
        return "/about-us/about";
    }
}
