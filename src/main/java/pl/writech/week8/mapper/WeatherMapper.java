package pl.writech.week8.mapper;

import pl.writech.week8.domain.Weather;
import pl.writech.week8.integration.WeatherResponse;

import java.util.ArrayList;
import java.util.List;

public class WeatherMapper {

    public static List<Weather> doMapping(WeatherResponse weatherResponse) {
        final String IMG_URL = "https://www.weatherbit.io/static/img/icons/";

        List<Weather> weathers = new ArrayList<>();
        weatherResponse.getData().forEach(datum -> {
            Weather weather = new Weather();
            weather.setCity(datum.getCityName());
            weather.setCloudCoverage(datum.getClouds());
            weather.setHumidity(datum.getRh());
            weather.setPressure(datum.getPres());
            weather.setTemp(datum.getTemp());
            weather.setImgSrc(IMG_URL + datum.getWeather().getIcon() + ".png");
            weathers.add(weather);
        });

        return weathers;
    }
}
