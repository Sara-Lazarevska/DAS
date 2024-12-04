package ukim.finki.das.demo.homework.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String issuer; // Stock issuer
    private Integer year; // Year of the record
    private String date; // Date of the record
    private Double lastTradePrice; // Last trade price
    private Double max; // Maximum price
    private Double min; // Minimum price
    private Double avgPrice; // Average price
    private Double percentageChange; // Percentage change in price
    private Long volume; // Volume of shares traded
    private Double turnoverInBest; // Turnover in BEST
    private Double totalTurnover; // Total turnover in denars

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(Double lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(Double percentageChange) {
        this.percentageChange = percentageChange;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getTurnoverInBest() {
        return turnoverInBest;
    }

    public void setTurnoverInBest(Double turnoverInBest) {
        this.turnoverInBest = turnoverInBest;
    }

    public Double getTotalTurnover() {
        return totalTurnover;
    }

    public void setTotalTurnover(Double totalTurnover) {
        this.totalTurnover = totalTurnover;
    }
}
