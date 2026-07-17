public class FleetTest {

    public static void main(String[] args) {

        DeliveryDrone drone = new DeliveryDrone("SkyDrop", "DX-100", 95);

        SelfDrivingCar car = new SelfDrivingCar("AutoRide", "XR-5", 80);

        SecurityRover rover = new SecurityRover("Guardian", "SR-9", 70);

        System.out.println("=== Autonomous Vehicle Fleet ===");
        System.out.println();

        drone.performTask();
        car.performTask();
        rover.performTask();
    }
}