package pl.writech.week8.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString(exclude = "id")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imgSrc;
    private String city;
    private Integer humidity;
    private Integer cloudCoverage;
    private Double pressure;
    private Double temp;

    public Weather() {
    }
}

