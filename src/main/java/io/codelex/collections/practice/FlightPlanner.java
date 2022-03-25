package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner scanner = new Scanner(System.in);

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        List<String> lines = Files.readAllLines(path, charset);

        HashMap<String, List<String>> flightInfo = getDataFromFile(lines);

        String userInput;

        List<String> selectedCities = new ArrayList<>();

        String startCity;


        while (true) {
            System.out.println("What would you like to do:\n" +
                    "To display list of the cities press 1\n" +
                    "To exit program press #");
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                citiesAndDestinations(flightInfo);
                break;
            } else if (userInput.equals("#")) {
                System.out.println("Goodbye");
                System.exit(0);
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        while (true) {
            System.out.println("To select a city from which you would like to start press 1\n" +
                    "To exit press #");
            userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("From which city you want to travel?");
                startCity = scanner.nextLine();

                if (!flightInfo.containsKey(startCity)) {
                    System.out.println("There is no such city in the list, try again.");
                    continue;
                }
                selectedCities.add(startCity);
                System.out.println("Destinations from " + startCity + " : ");
                flightInfo.get(startCity).forEach(System.out::println);
                break;
            } else if (userInput.equals("#")) {
                System.out.println("Goodbye.");
                System.exit(0);
            } else {
                System.out.println("Invalid input, try again");
            }
        }

        while (true) {
            System.out.println("Select your next destination: ");
            String nextCity = scanner.nextLine();
            if (!flightInfo.containsKey(nextCity)) {
                System.out.println("There is no such city in the list, try again.");
                continue;
            }
            selectedCities.add(nextCity);
            if (nextCity.equals(startCity)) {
                System.out.println("Cities from your travel: ");

                for (String city : selectedCities) {
                    System.out.println(city + " ");
                }
                break;
            }
            flightInfo.get(nextCity).forEach(System.out::println);
        }
    }


    private static HashMap<String, List<String>> getDataFromFile(List<String> lines) {
        HashMap<String, List<String>> flightInfo = new HashMap<>();

        for (String element : lines) {
            String[] split = element.split("->");
            String startCity = split[0].trim();
            String endCity = split[1].trim();

            flightInfo.computeIfAbsent(startCity, key -> new ArrayList<>()).add(endCity);
        }
        return flightInfo;
    }

    private static void citiesAndDestinations(HashMap<String, List<String>> flightInfo) {
        System.out.println("Cities and their destinations:");
        for (Map.Entry<String, List<String>> i : flightInfo.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
        System.out.println();
    }


}
