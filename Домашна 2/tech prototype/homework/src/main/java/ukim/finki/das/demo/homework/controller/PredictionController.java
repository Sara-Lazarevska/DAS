package ukim.finki.das.demo.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ukim.finki.das.demo.homework.service.PredictionService;

@Controller
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/predictions")
    public String getPredictions(Model model) {
        model.addAttribute("predictions", predictionService.getPredictions());
        return "predictions"; // Refers to templates/predictions.html
    }
}
