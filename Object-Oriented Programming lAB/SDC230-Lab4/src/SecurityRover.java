public class SecurityRover extends Vehicle {

    public SecurityRover(String vehicleName, String model, int batteryLevel) {
        super(vehicleName, model, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(vehicleName + " patrols the facility and monitors for security threats.");
    }
}