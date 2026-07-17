public class Vehicle {

    String vehicleName;
    String model;
    int batteryLevel;

    public Vehicle(String vehicleName, String model, int batteryLevel) {
        this.vehicleName = vehicleName;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void performTask() {
        System.out.println(vehicleName + " is performing a general vehicle task.");
    }
}