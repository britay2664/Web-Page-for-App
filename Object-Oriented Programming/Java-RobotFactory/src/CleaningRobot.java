public class CleaningRobot extends Robot {

    public CleaningRobot(String name, String modelNumber, int batteryLevel) {
        super(name, modelNumber, batteryLevel);
    }

    @Override
    public void performTask() {
        System.out.println(name + " sweeps and vacuums the floor.");
    }

}