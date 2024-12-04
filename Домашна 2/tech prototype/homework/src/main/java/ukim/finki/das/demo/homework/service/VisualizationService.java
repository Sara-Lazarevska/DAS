package ukim.finki.das.demo.homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ukim.finki.das.demo.homework.repository.StockDataRepository;

import java.util.List;

@Service
public class VisualizationService {

    @Autowired
    private StockDataRepository stockDataRepository;

    public List<?> getAggregatedData() {
        // Replace this with a query that performs filtering/aggregation
        return stockDataRepository.findAll();
    }
}
