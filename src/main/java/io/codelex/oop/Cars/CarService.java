package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static final int AT_LEAST_THREE_MANUFACTURERS = 3;

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
        for (Car car : carList) {
            if (car.getEngineType() == engineType) {
                carsWithSpecificEngineType.add(car);
            }
        }
        return carsWithSpecificEngineType;
    }

    public List<Car> getYearBefore(int year) {
        List<Car> carsBeforeSpecificYear = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < year) {
                carsBeforeSpecificYear.add(car);
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
        for (Car car : carList) {
            if (car.getManufacturerList().size() >= AT_LEAST_THREE_MANUFACTURERS) {
                System.out.println(car);
            }
        }
    }

    public List<Car> sortByNameAscending() {
        return getCarList()
                .stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList());
    }

    public List<Car> sortByNameDescending() {
        return getCarList()
                .stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .collect(Collectors.toList());
    }

    public boolean checkIfCarInList(Car car) {
        return carList.contains(car);
    }

    public List<Car> specificManufacturer(Manufacturer manufacturer) {
        List<Car> carsWithSameManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturerList().contains(manufacturer)) {
                carsWithSameManufacturer.add(car);
            }
        }
        return carsWithSameManufacturer;
    }

    public List<Car> sameManufacturer(String name, int year) {
        List<Car> carListWithSameManufacturer = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                if (manufacturer.getName().equals(name) && manufacturer.getYearOfEstablishment() == year) {
                    carListWithSameManufacturer.add(car);
                }
            }
        }
        return carListWithSameManufacturer;
    }


}
