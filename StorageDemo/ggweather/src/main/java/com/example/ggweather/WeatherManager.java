package com.example.ggweather;

/**
 * Created by LoveExtra on 2016/6/16.
 */
public class WeatherManager {
    private String area;                //地区名
    private String provinceOfArea;      //地区所在省
    private String postcodeOfArea;      //地区邮编
    private String weather;             //天气
    private String exponentOfAir;       //空气指数
    private String humidityOfAir;       //空气湿度
    private String timeOfData;          //数据更新时间
    private String temperature;         //温度
    private String windDirection;       //风向
    private String windPower;           //风力强度
    private String qualityOfAir;        //大气质量
    private String primaryPollution;    //主要污染物
    private String PM2_5;               //PM2.5指数

    public WeatherManager() {

    }

    public WeatherManager(String area, String provinceOfArea, String postcodeOfArea,
                          String weather, String exponentOfAir, String humidityOfAir,
                          String timeOfData, String temperature, String windDirection,
                          String windPower, String qualityOfAir, String primaryPollution, String PM2_5) {
        this.area = area;
        this.provinceOfArea = provinceOfArea;
        this.postcodeOfArea = postcodeOfArea;
        this.weather = weather;
        this.exponentOfAir = exponentOfAir;
        this.humidityOfAir = humidityOfAir;
        this.timeOfData = timeOfData;
        this.temperature = temperature;
        this.windDirection = windDirection;
        this.windPower = windPower;
        this.qualityOfAir = qualityOfAir;
        this.primaryPollution = primaryPollution;
        this.PM2_5 = PM2_5;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProvinceOfArea() {
        return provinceOfArea;
    }

    public void setProvinceOfArea(String provinceOfArea) {
        this.provinceOfArea = provinceOfArea;
    }

    public String getPostcodeOfArea() {
        return postcodeOfArea;
    }

    public void setPostcodeOfArea(String postcodeOfArea) {
        this.postcodeOfArea = postcodeOfArea;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getExponentOfAir() {
        return exponentOfAir;
    }

    public void setExponentOfAir(String exponentOfAir) {
        this.exponentOfAir = exponentOfAir;
    }

    public String getHumidityOfAir() {
        return humidityOfAir;
    }

    public void setHumidityOfAir(String humidityOfAir) {
        this.humidityOfAir = humidityOfAir;
    }

    public String getTimeOfData() {
        return timeOfData;
    }

    public void setTimeOfData(String timeOfData) {
        this.timeOfData = timeOfData;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getQualityOfAir() {
        return qualityOfAir;
    }

    public void setQualityOfAir(String qualityOfAir) {
        this.qualityOfAir = qualityOfAir;
    }

    public String getPrimaryPollution() {
        return primaryPollution;
    }

    public void setPrimaryPollution(String primaryPollution) {
        this.primaryPollution = primaryPollution;
    }

    public String getPM2_5() {
        return PM2_5;
    }

    public void setPM2_5(String PM2_5) {
        this.PM2_5 = PM2_5;
    }
}
