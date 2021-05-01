package com.sda.weather;

public class LocalService {

    private LocalRepository localRepository;

    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public Location createNewLocation(String cityName, String longitude, String latitude, String region, String country) {
        if (cityName == null) { // walidacja danych
            throw new RuntimeException("Nazwa miasta nie może być pusta!");
        }
        ;
        if (country == null) {
            throw new RuntimeException("Nazwa kraju nie może być pusta!");
        }
        ;
        if (region == null) {
            throw new RuntimeException("Nazwa regionu jest nieprawidłowa!");
        }
        if (latitude < -180 && latitude> 180){
            throw new RuntimeException("Niepoprawny zakres szerokości geograficznej");

        }



        Location location = new Location(cityName, country);
        Location saveLocation = localRepository.save(location);
        return saveLocation;
    }


}
