package com.sda.weather;

public class LocationController {

    private LocationService localService;

    public LocationController(LocationService localService) {
        this.localService = localService;
    }

    public String addWeatherLocation(String cityName, int longitude, int latitude, String region, String country) {
        Location newLocation = localService.createNewLocation(cityName, longitude, latitude, region, country);
        // todo you can use new ObjectMapper() -> pm.xml -> jackson-databind
        //  objectMapper.writeValueAsString(newLocation)
        return String.format("{\"id\": %s, \"cityName\": \"%s\", \"country\": \"%s\"\"longitude\": \"%s\"\"latitude\": \"%s\",\"region\": \"%s\",\"country\": \"%s\"}",
                newLocation.getId(), newLocation.getCityName(), newLocation.getCountry(), newLocation.getLongitude(), newLocation.getLatitude(), newLocation.getRegion(), newLocation.getCountry());
    }
}
