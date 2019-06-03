public class Main {
    public static void main(String[] args) {

        Car car = new Car("Opel Astra", 48, 8, false);

        Truck truck = new Truck("Star", 150, 15, false, 320);

        showCarInfo(car);
        showTruckInfo(truck);

        car.setClimaOn(true);
        truck.setClimaOn(true);

        showCarInfo(car);
        showTruckInfo(truck);

    }

    private static void showCarInfo(Car car) {
        System.out.println();
        System.out.println("Nazwa: " + car.getName());
        if (car.isClimaOn()) {
            System.out.println("Klimatyzacja włączona");
        } else {
            System.out.println("Klimatyzacja wyłączona");
        }
        System.out.println("Pojemność zbiornika paliwa [l]: " + car.getCapacity());
        System.out.println("Średnie zużycie paliwa [l/km]: "+ car.getAverageFuelConsumption());
        System.out.println("Zasięg [km]: "+ car.getRange(car.getCapacity(), car.getAverageFuelConsumption()));
        System.out.println();
    }

    private static void showTruckInfo(Truck truck) {
        System.out.println();
        System.out.println("Nazwa: " + truck.getName());
        if (truck.isClimaOn()) {
            System.out.println("Klimatyzacja włączona");
        } else {
            System.out.println("Klimatyzacja wyłączona");
        }
        System.out.println("Pojemność zbiornika paliwa [l]: " + truck.getCapacity());
        System.out.println("Średnie zużycie paliwa [l/km]: "+ truck.getAverageFuelConsumption());
        System.out.println("Obciążenie [kg]: " + truck.getLoadWeight());
        System.out.println("Zasięg [km]: "+ truck.getRange(truck.getCapacity(), truck.getAverageFuelConsumption()));
        System.out.println();

    }

}

