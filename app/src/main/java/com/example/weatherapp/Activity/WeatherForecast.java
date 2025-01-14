package com.example.weatherapp.Activity;

public class WeatherForecast {
    private Long date;
    private String timeZone;
    private Double temp;
    private String icon;

    public WeatherForecast(Long date, String timeZone, Double temp, String icon) {
        this.date = date;
        this.timeZone = timeZone;
        this.temp = temp;
        this.icon = icon;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
