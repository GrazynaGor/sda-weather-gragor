package com.sda.weather.com.sda.weather;

public class Location {
    String cityName;
    String longitude; // długość geograficzna
    String latitude;// szerokość geograficzna
    String region;
    String country;

    public Location() {
    }

    public Location(String cityName, String country) {
        this.cityName = cityName;
        this.country = country;
    }

    public Location(String cityName, String longitude, String latitude, String region, String country) {
        this.cityName = cityName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.region = region;
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
