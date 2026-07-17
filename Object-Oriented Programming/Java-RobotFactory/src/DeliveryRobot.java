public class DeliveryRobot extends Robot {

    public DeliveryRobot(String name, String modelNumber, int batteryLevel) {
        super(name, modelNumber, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(name + " delivers supplies throughout the facility.");
    }

}