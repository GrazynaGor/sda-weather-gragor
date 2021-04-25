package com.sda.weather.com.sda.weather;

public class LocalService {

    public Location createNewLocation(String cityName,String countyName){
        Location location = new Location(cityName, countyName);
        return location;
    }


}
