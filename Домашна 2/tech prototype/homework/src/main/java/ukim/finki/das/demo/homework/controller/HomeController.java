package ukim.finki.das.demo.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        // Add attributes if you need to show data on the homepage
        model.addAttribute("welcomeMessage", "Welcome to Македонска Берза!");
        return "index"; // Refers to templates/index.html
    }
}
