package com.sda.weather;

public class LocalController {

    private LocalService localService;

    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    public String addWeatherLocation(String cityName, String longitude, String latitude, String region, String country){
        Location newLocation = localService.createNewLocation(cityName, longitude, latitude,region,country);
        return String.format("{\"id\": %s, \"cityName\": \"%s\", \"country\": \"%s\"\"longitude\": \"%s\"\"latitude\": \"%s\",\"region\": \"%s\",}",
                newLocation.getId(), newLocation.getCityName(), newLocation.getCountry(), newLocation.getLongitude(), newLocation.getLatitude(), newLocation.getRegion());
    }
}
