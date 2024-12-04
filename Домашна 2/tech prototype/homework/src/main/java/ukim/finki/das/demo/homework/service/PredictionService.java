package ukim.finki.das.demo.homework.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionService {

    public List<String> getPredictions() {
        // Dummy implementation. Replace with actual Weka ML predictions.
        return List.of("Prediction 1: $120.5", "Prediction 2: $123.0", "Prediction 3: $118.7");
    }
}
