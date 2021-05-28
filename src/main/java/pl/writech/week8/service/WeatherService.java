package pl.writech.week8.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.writech.week8.domain.Weather;
import pl.writech.week8.integration.WeatherResponse;
import pl.writech.week8.mapper.WeatherMapper;
import pl.writech.week8.repository.WeatherRepository;

import java.util.List;

@Service
public class WeatherService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static final String url = "https://api.weatherbit.io/v2.0/current?";

    @Value("${weather.api-key}")
    private String apiKey;
    @Value("${weather.country}")
    private String country;
    @Value("${weather.city}")
    private String city;

    private final WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Scheduled(cron = "0 0 */1 * * * ")
    public void saveWeather() {
        WeatherResponse weatherResponse = receiveWeather(city);

        List<Weather> weathers = WeatherMapper.doMapping(weatherResponse);
        weathers.forEach(weather -> logger.info("Pobrana pogoda: " + weather.toString()));

        weatherRepository.saveAll(weathers);
    }

    private WeatherResponse receiveWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String endpoint = url + "city=" + city + "&country=" + country + "&key=" + apiKey;
        logger.info("Request to endpoint: " + endpoint);
        return restTemplate.getForObject(endpoint, WeatherResponse.class);
    }


}

