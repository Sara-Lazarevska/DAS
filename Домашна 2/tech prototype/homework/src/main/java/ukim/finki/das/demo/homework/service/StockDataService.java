package ukim.finki.das.demo.homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ukim.finki.das.demo.homework.model.StockData;
import ukim.finki.das.demo.homework.repository.StockDataRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class StockDataService {

    @Autowired
    private StockDataRepository stockDataRepository;

    public void importCSVToDatabase(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip header row
                    continue;
                }

                String[] data = line.split(",");

                StockData stockData = new StockData();
                stockData.setIssuer(data[0]); // Issuer
                stockData.setYear(Integer.parseInt(data[1])); // Year
                stockData.setDate(data[2]); // Date
                stockData.setLastTradePrice(Double.parseDouble(data[3])); // Last trade price
                stockData.setMax(Double.parseDouble(data[4])); // Max
                stockData.setMin(Double.parseDouble(data[5])); // Min
                stockData.setAvgPrice(Double.parseDouble(data[6])); // Avg.Price
                stockData.setPercentageChange(Double.parseDouble(data[7])); // %chg.
                stockData.setVolume(Long.parseLong(data[8])); // Volume
                stockData.setTurnoverInBest(Double.parseDouble(data[9])); // Turnover in BEST
                stockData.setTotalTurnover(Double.parseDouble(data[10])); // Total turnover

                stockDataRepository.save(stockData);
            }
        }
    }
}
