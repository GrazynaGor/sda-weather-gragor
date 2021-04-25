package com.sda.weather.com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);

    public void runWeatherApplication() {

        while (true) {
            System.out.println("Aplikacja pogodowa włączona!");
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
    }

    private void showMyLocations() {
    }

    private void addWeatherLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta: ");
        String cityName = scanner.nextLine();
        System.out.println("Podaj nazwę kraju: ");
        String countryName = scanner.nextLine();

    }


}