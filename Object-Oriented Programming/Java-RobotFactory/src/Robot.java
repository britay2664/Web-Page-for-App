public class Robot {

    String name;
    String modelNumber;
    int batteryLevel;

    public Robot(String name, String modelNumber, int batteryLevel) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.batteryLevel = batteryLevel;
    }

    public void performTask() {
        System.out.println(name + " performs its default task.");
    }

}