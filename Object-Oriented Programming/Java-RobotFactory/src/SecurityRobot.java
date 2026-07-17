public class SecurityRobot extends Robot {

    public SecurityRobot(String name, String modelNumber, int batteryLevel) {
        super(name, modelNumber, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(name + " scans the area for intruders.");
    }

}