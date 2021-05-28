package pl.writech.week8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.writech.week8.domain.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
