// Vehicle is the base abstract class for all vehicles. 
//It stores their common information and defines the common behavior that subclasses like Car and Motorcycle must implement.

public abstract class Vehicle implements Rentable {
    private final String licensePlate;
    private final String model;
    private final double dailyRate;

    public Vehicle(String licensePlate, String model, double dailyRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public String getDetails() {
        return "License plate: " + licensePlate
                + ", Model: " + model
                + ", Daily rate: " + dailyRate;
    }

    @Override
    public abstract double calculateRentalCost(int days);
}
