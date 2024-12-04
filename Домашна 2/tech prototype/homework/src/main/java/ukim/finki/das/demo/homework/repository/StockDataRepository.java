package ukim.finki.das.demo.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.das.demo.homework.model.StockData;

@Repository
public interface StockDataRepository extends JpaRepository<StockData, Long> {
    // Add custom queries here if necessary, e.g., for filtering or aggregation
}
