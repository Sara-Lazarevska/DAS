package ukim.finki.das.demo.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ukim.finki.das.demo.homework.service.StockDataService;

@Controller
public class StockDataController {

    @Autowired
    private StockDataService stockDataService;

    @GetMapping("/historical-data")
    public String getHistoricalData(Model model) {
        model.addAttribute("stocks", stockDataService.getAllStockData());
        return "historical-data"; // Refers to templates/historical-data.html
    }
}
