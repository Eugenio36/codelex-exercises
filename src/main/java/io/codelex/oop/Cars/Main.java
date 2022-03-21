package io.codelex.oop.Cars;

public class Main {
    public static void main(String[] args) {

        Manufacturer Daimler1 = new Manufacturer("Daimler1", 1981, "Japan");
        Manufacturer Daimler2 = new Manufacturer("Daimler2", 1983, "Japan");
        Manufacturer Daimler3 = new Manufacturer("Daimler3", 1985, "Japan");
        Manufacturer Daimler4 = new Manufacturer("Daimler4", 1991, "Japan");
        Manufacturer Daimler5 = new Manufacturer("Daimler5", 1995, "Japan");
        Manufacturer Daimler6 = new Manufacturer("Daimler6", 1997, "Japan");
        Manufacturer Daimler7 = new Manufacturer("Daimler7", 1999, "Japan");
        Manufacturer Daimler8 = new Manufacturer("Daimler8", 2001, "Japan");


        Car mercedesS500 = new Car("Mercedes", "S500", 250_000, 2020, EngineType.V12);
        Car bmwE3 = new Car("BMW", "E3", 47_000, 2009, EngineType.S3);
        Car audiA6 = new Car("Audi", "A6", 24_000, 1997, EngineType.S4);
        Car opelAstra = new Car("Opel", "Astra", 12_000, 2007, EngineType.S6);
        Car nissanSunny = new Car("Nissan", "Sunny", 19_500, 1991, EngineType.V6);
        Car kiaSportage = new Car("KIA", "Sportage", 23_700, 2017, EngineType.V8);
        Car suzukiVitara = new Car("Suzuki", "Vitara", 49_000, 2001, EngineType.V12);
        Car fordFocus = new Car("Ford", "Focus", 14_000, 2006, EngineType.S6);

        // Checking how code works
        System.out.println("Manufacturer1 country: " + Daimler1.getCountry());
        System.out.println("Manufacturer3 year of establishment: " + Daimler3.getYearOfEstablishment());
        System.out.println("Car1 price: " + (int) mercedesS500.getPrice());
        System.out.println("Car7 model: " + suzukiVitara.getModel());

        // Adding car to different manufacturers
        mercedesS500.addManufacturerList(Daimler8);
        mercedesS500.addManufacturerList(Daimler8);
        mercedesS500.addManufacturerList(Daimler8);
        opelAstra.addManufacturerList(Daimler5);
        nissanSunny.addManufacturerList(Daimler7);
        System.out.println("----------------------------------------------------");


        CarService carService = new CarService();

        carService.addCar(mercedesS500);
        carService.addCar(bmwE3);
        carService.addCar(audiA6);
        carService.addCar(opelAstra);
        carService.addCar(nissanSunny);
        carService.addCar(kiaSportage);
        carService.addCar(suzukiVitara);
        carService.addCar(fordFocus);
        System.out.println("Car list: " + carService.getCarList() + "\n");

        carService.removeFromCarList(fordFocus);
        System.out.println("Removed fordFocus from list and showing new list: " + carService.getCarList() + "\n");

        System.out.println("Car list with V12 engine: " + carService.getCarByEngine(EngineType.V12) + "\n");

        System.out.println("Car list before 1999 year: " + carService.getYearBefore(1999) + "\n");

        System.out.println("Most expensive car in the list:");
        carService.getMostExpensiveCar();
        System.out.println();

        System.out.println("Cheapest car in the list: ");
        carService.getCheapestCar();
        System.out.println();

        System.out.println("Showing the car with at least 3 manufacturers: ");
        carService.getNumberOfManufacturers();
        System.out.println();

        System.out.println("Sort by name (ascending): " + carService.sortByNameAscending() + "\n");

        System.out.println("Sort by name (descending): " + carService.sortByNameDescending() + "\n");

        System.out.println("Check if car is in the list: " + carService.checkIfCarInList(mercedesS500) + "\n");

        System.out.println("List of cars manufactured by a specific manufacturer: " + carService.getCarByManufacturer(Daimler5) + "\n");

        //returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
        System.out.println(carService.sameManufacturer("Daimler4", 1991));

    }
}
