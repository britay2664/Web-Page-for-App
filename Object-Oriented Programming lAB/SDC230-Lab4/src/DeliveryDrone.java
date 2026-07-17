public class DeliveryDrone extends Vehicle {

    public DeliveryDrone(String vehicleName, String model, int batteryLevel) {
        super(vehicleName, model, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(vehicleName + " delivers packages through the air.");
    }
}