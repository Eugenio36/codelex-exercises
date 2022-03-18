package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeFromCarList(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarByEngine(EngineType engineType) {
        List<Car> carsWithSpecificEngineType = new ArrayList<>();
        for (Car c : carList) {
            if (c.getEngineType() == engineType) {
                carsWithSpecificEngineType.add(c);
            }
        }
        return carsWithSpecificEngineType;
    }

    public List<Car> getYearBefore(int year) {
        List<Car> carsBeforeSpecificYear = new ArrayList<>();
        for (Car c : carList) {
            if (c.getYearOfManufacture() < year) {
                carsBeforeSpecificYear.add(c);
            }
        }
        return carsBeforeSpecificYear;
    }

    public void getMostExpensiveCar() {
        Car car = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
        System.out.println(car);
    }

    public void getCheapestCar() {
        Car car = Collections.min(carList, Comparator.comparingDouble(Car::getPrice));
        System.out.println(car);
    }

    public void getNumberOfManufacturers() {
        for (Car c : carList) {
            if (c.getManufacturerList().size() >= 3) {
                System.out.println(c);
            }
        }
    }

    public List<Car> sortByNameAscending() {
        List<Car> sortedListAscending = new ArrayList<>();
        sortedListAscending = getCarList()
                .stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList());
        return sortedListAscending;
    }

    public List<Car> sortByNameDescending() {
        List<Car> sortedListDescending = new ArrayList<>();
        sortedListDescending = getCarList()
                .stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .collect(Collectors.toList());
        return sortedListDescending;
    }

    public boolean checkIfCarInList(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarByManufacturer(Manufacturer manufacturer) {
        List<Car> carFromManufacturer = new ArrayList<>();
        for (Car c : carList) {
            if (c.getManufacturerList().contains(manufacturer)) {
                carFromManufacturer.add(c);
            }
        }
        return carFromManufacturer;
    }

    public List<Car> sameManufacturer(String name, int year) {
        List<Car> carListWithSameManufacturer = new ArrayList<>();
        for (Car c : carList) {
            for (Manufacturer manufacturer : c.getManufacturerList()) {
                if (manufacturer.getName().equals(name) && manufacturer.getYearOfEstablishment() == year) {
                    carListWithSameManufacturer.add(c);
                }
            }
        }
        return carListWithSameManufacturer;
    }


}
