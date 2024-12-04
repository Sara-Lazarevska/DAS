package ukim.finki.das.demo.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.das.demo.homework.service.PredictionService;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/api/predictions")
    public List<String> getPredictions() {
        return predictionService.getPredictions();
    }
}
