public class Truck extends Car {
    private double loadWeight;

    Truck(String name, double capacity, double averageFuelConsumption, boolean isClimaOn, double loadWeight) {
        super(name, capacity, averageFuelConsumption, isClimaOn);
        this.loadWeight = loadWeight;

        double extraFuelConsumption = ((int) (loadWeight / 100)) * 0.5;
        setClimaOn(isClimaOn);
        setAverageFuelConsumption(getAverageFuelConsumption() + extraFuelConsumption);
    }

    double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}

