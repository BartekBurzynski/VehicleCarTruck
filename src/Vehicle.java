public class Vehicle {
    private String name;

    private double capacity;

    private double averageFuelConsumption;

    Vehicle(String name, double capacity, double averageFuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }
}

