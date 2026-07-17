public class RobotTest {

    public static void main(String[] args) {

        CleaningRobot cleaner =
                new CleaningRobot("SweepBot", "CL-100", 95);

        SecurityRobot guard =
                new SecurityRobot("GuardianX", "SR-500", 88);

        DeliveryRobot courier =
                new DeliveryRobot("CargoBot", "DL-300", 90);

        System.out.println("===== Robot Factory Simulation =====");
        System.out.println();

        cleaner.performTask();
        guard.performTask();
        courier.performTask();

    }

}