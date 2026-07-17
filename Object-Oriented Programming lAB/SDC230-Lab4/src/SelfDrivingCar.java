public class SelfDrivingCar extends Vehicle {

    public SelfDrivingCar(String vehicleName, String model, int batteryLevel) {
        super(vehicleName, model, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(vehicleName + " safely navigates busy city streets.");
    }
}