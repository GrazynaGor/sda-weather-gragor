package com.sda.weather;

import java.net.URI;
import java.net.http.HttpClient;
import java.util.Scanner;

public class UserInterface {

    private LocalController localController;

    public UserInterface(LocalController localController) {
        this.localController = localController;
    }

    public void runWeatherApplication() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Aplikacja pogodowa!");
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodać lokalizację do obserwacji pogody");
            System.out.println("2. Wyświetl dodane lokalizacje");
            System.out.println("3. Pobierz pogodę dla lokalizacji");
            System.out.println("0. Wyłącz aplikację");

            int i = scanner.nextInt();

            switch (i) {
                case 0:
                    return;
                case 1:
                    addWeatherLocation();
                    break;
                case 2:
                    showMyLocations();
                    break;
                case 3:
                    downloadWeatherForMyLocation();
                    break;

            }
        }
    }

    private void downloadWeatherForMyLocation() {
        HttpClient client;
        System.out.println("Pobieram pogodę");
    }

    private void showMyLocations() {
        System.out.println("Pokazuje wpisane Twoje lokalizacje pogodowe: ");
    }

    private void addWeatherLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta: ");
        String cityName = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną: ");
        String latitude = scanner.nextLine();
        System.out.println("Podaj długość geograficzną: ");
        String longitude = scanner.nextLine();
        System.out.println("Podaj nazwę regionu: ");
        String region = scanner.nextLine();
        System.out.println("Podaj nazwę kraju: ");
        String country = scanner.nextLine();
        String response = localController.addWeatherLocation(cityName, latitude, longitude, region, country);
        System.out.println("Lokalizacja została dodana! " + response);
    }
}