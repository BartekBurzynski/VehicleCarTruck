public class Car extends Vehicle {
    Car(String name, double capacity, double averageFuelConsumption, boolean isClimaOn) {
        super(name, capacity, averageFuelConsumption);
        setClimaOn(isClimaOn);

    }

    private boolean isClimaOn;

    boolean isClimaOn() {
        return isClimaOn;
    }

    void setClimaOn(boolean climaOn) {

        if (isClimaOn != climaOn) {
            updateAvarageFuelConsumption(climaOn);
        }

        isClimaOn = climaOn;
    }

    double getRange(double capacity, double avarageFuelConsumption) {
        double range = capacity / avarageFuelConsumption * 100;
        return range;

    }

    private void updateAvarageFuelConsumption(boolean climaOn) {

        if (getClass() == Car.class) {
            if (climaOn == true) {
                setAverageFuelConsumption(getAverageFuelConsumption() + 0.8);
            } else {
                setAverageFuelConsumption(getAverageFuelConsumption() - 0.8);

            }
        }
        if (getClass() == Truck.class) {
            if (climaOn == true) {
                setAverageFuelConsumption(getAverageFuelConsumption() + 1.6);
            } else {
                setAverageFuelConsumption(getAverageFuelConsumption() - 1.6);

            }
        }


    }
}

