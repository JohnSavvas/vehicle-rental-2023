public class Car extends Vehicle {   // creation of a class named Car that inherits from Vehicle
    private final boolean hasAirConditioning; 

    public Car(String licensePlate, String model, double dailyRate, boolean hasAirConditioning) { // constructor 
        super(licensePlate, model, dailyRate);  // calling the constructor of parent class Vehicle.
        this.hasAirConditioning = hasAirConditioning;  
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getDailyRate() * days;

        if (hasAirConditioning) {
            totalCost *= 1.10;
        }

        return totalCost;
    }
}
