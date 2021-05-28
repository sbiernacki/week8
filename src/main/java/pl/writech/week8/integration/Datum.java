package pl.writech.week8.integration;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rh",
        "pod",
        "lon",
        "pres",
        "timezone",
        "ob_time",
        "country_code",
        "clouds",
        "ts",
        "solar_rad",
        "state_code",
        "city_name",
        "wind_spd",
        "wind_cdir_full",
        "wind_cdir",
        "slp",
        "vis",
        "h_angle",
        "sunset",
        "dni",
        "dewpt",
        "snow",
        "uv",
        "precip",
        "wind_dir",
        "sunrise",
        "ghi",
        "dhi",
        "aqi",
        "lat",
        "weather",
        "datetime",
        "temp",
        "station",
        "elev_angle",
        "app_temp"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("rh")
    private Integer rh;
    @JsonProperty("pod")
    private String pod;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("pres")
    private Double pres;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("ob_time")
    private String obTime;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("ts")
    private Integer ts;
    @JsonProperty("solar_rad")
    private Double solarRad;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("wind_spd")
    private Integer windSpd;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("slp")
    private Double slp;
    @JsonProperty("vis")
    private Integer vis;
    @JsonProperty("h_angle")
    private Integer hAngle;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("dni")
    private Double dni;
    @JsonProperty("dewpt")
    private Double dewpt;
    @JsonProperty("snow")
    private Integer snow;
    @JsonProperty("uv")
    private Double uv;
    @JsonProperty("precip")
    private Integer precip;
    @JsonProperty("wind_dir")
    private Integer windDir;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("ghi")
    private Double ghi;
    @JsonProperty("dhi")
    private Double dhi;
    @JsonProperty("aqi")
    private Integer aqi;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("weather")
    private WeatherItem weatherItem;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("temp")
    private Double temp;
    @JsonProperty("station")
    private String station;
    @JsonProperty("elev_angle")
    private Double elevAngle;
    @JsonProperty("app_temp")
    private Double appTemp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rh")
    public Integer getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(Integer rh) {
        this.rh = rh;
    }

    @JsonProperty("pod")
    public String getPod() {
        return pod;
    }

    @JsonProperty("pod")
    public void setPod(String pod) {
        this.pod = pod;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("pres")
    public Double getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(Double pres) {
        this.pres = pres;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("ob_time")
    public String getObTime() {
        return obTime;
    }

    @JsonProperty("ob_time")
    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("ts")
    public Integer getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @JsonProperty("solar_rad")
    public Double getSolarRad() {
        return solarRad;
    }

    @JsonProperty("solar_rad")
    public void setSolarRad(Double solarRad) {
        this.solarRad = solarRad;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("wind_spd")
    public Integer getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(Integer windSpd) {
        this.windSpd = windSpd;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    @JsonProperty("slp")
    public Double getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Double slp) {
        this.slp = slp;
    }

    @JsonProperty("vis")
    public Integer getVis() {
        return vis;
    }

    @JsonProperty("vis")
    public void setVis(Integer vis) {
        this.vis = vis;
    }

    @JsonProperty("h_angle")
    public Integer gethAngle() {
        return hAngle;
    }

    @JsonProperty("h_angle")
    public void sethAngle(Integer hAngle) {
        this.hAngle = hAngle;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("dni")
    public Double getDni() {
        return dni;
    }

    @JsonProperty("dni")
    public void setDni(Double dni) {
        this.dni = dni;
    }

    @JsonProperty("dewpt")
    public Double getDewpt() {
        return dewpt;
    }

    @JsonProperty("dewpt")
    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    @JsonProperty("snow")
    public Integer getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
    }

    @JsonProperty("precip")
    public Integer getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    @JsonProperty("wind_dir")
    public Integer getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("ghi")
    public Double getGhi() {
        return ghi;
    }

    @JsonProperty("ghi")
    public void setGhi(Double ghi) {
        this.ghi = ghi;
    }

    @JsonProperty("dhi")
    public Double getDhi() {
        return dhi;
    }

    @JsonProperty("dhi")
    public void setDhi(Double dhi) {
        this.dhi = dhi;
    }

    @JsonProperty("aqi")
    public Integer getAqi() {
        return aqi;
    }

    @JsonProperty("aqi")
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("weather")
    public WeatherItem getWeather() {
        return weatherItem;
    }

    @JsonProperty("weather")
    public void setWeather(WeatherItem weatherItem) {
        this.weatherItem = weatherItem;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("elev_angle")
    public Double getElevAngle() {
        return elevAngle;
    }

    @JsonProperty("elev_angle")
    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    @JsonProperty("app_temp")
    public Double getAppTemp() {
        return appTemp;
    }

    @JsonProperty("app_temp")
    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
