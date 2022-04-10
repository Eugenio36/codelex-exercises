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

    public List<Car> getCarByManufacturer(Manufacturer manufacturer) {
        List<Car> carsWithSameManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.containsManufacturer(manufacturer)) {
                carsWithSameManufacturer.add(car);
            }

        }

        //carList.stream().filter((Car c) -> c.containsManufacturer(manufacturer)).toList();

        return carsWithSameManufacturer;
    }

    public List<Car> sameManufacturer(int yearOfEstablishment, String symbol) {
        List<Car> carListWithSameManufacturer = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {

                switch (symbol) {

                    case ">":
                        if (manufacturer.getYearOfEstablishment() > yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;

                    case "<":
                        if (manufacturer.getYearOfEstablishment() < yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;

                    case ">=":
                        if (manufacturer.getYearOfEstablishment() >= yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;

                    case "<=":
                        if (manufacturer.getYearOfEstablishment() <= yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;

                    case "=":
                        if (manufacturer.getYearOfEstablishment() == yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;

                    case "!=":
                        if (manufacturer.getYearOfEstablishment() != yearOfEstablishment) {
                            carListWithSameManufacturer.add(car);
                        }
                        break;
                }
            }
        }
        return carListWithSameManufacturer;
    }
}
