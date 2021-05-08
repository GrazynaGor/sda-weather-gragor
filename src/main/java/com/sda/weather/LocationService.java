package com.sda.weather;

public class LocationService {

    private LocationRepository localRepository;

    public LocationService(LocationRepository localRepository) {
        this.localRepository = localRepository;
    }

    public Location createNewLocation(String cityName, int longitude, int latitude, String region, String country) {
        if (cityName == null && cityName.isBlank()) { // walidacja danych
            throw new RuntimeException("Nazwa miasta nie może być pusta!");
        }
        if (country == null && country.isBlank()) {
            throw new RuntimeException("Nazwa kraju nie może być pusta!");
        }
        if (region == null) {   // todo you should allow it
            throw new RuntimeException("Nazwa regionu jest nieprawidłowa!");
        }
        if (latitude < -180 && latitude > 180) {    // todo -90 90
            throw new RuntimeException("Niepoprawny zakres szerokości geograficznej");
        }
        if (longitude < -90 && longitude > 90) {    // todo -180 180
            throw new RuntimeException("Niepoprawny zakres długości geograficznej");
        }

        Location location = new Location(null, cityName, longitude, latitude, region, country); // todo get rid of a region value

        if (region == null) {   // todo region != null && !region.isBlank()
            location.setRegion(region);
        }

        Location saveLocation = localRepository.save(location);
        return saveLocation;
    }
}
