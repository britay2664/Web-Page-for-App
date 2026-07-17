public class Main {

    public static void main(String[] args) {
        PoliceService police = new PoliceService(
                "City Police Service",
                "Public Safety Department",
                250);

        TransitService transit = new TransitService(
                "City Transit System",
                "Transportation Department",
                140);

        WasteManagement waste = new WasteManagement(
                "City Waste Management",
                "Public Works Department",
                95);

        System.out.println("===== SMART CITY SERVICE SIMULATION =====");

        System.out.println("\n--- Police Service ---");
        police.displayServiceInfo();
        police.operateService();

        System.out.println("\n--- Transit Service ---");
        transit.displayServiceInfo();
        transit.operateService();

        System.out.println("\n--- Waste Management Service ---");
        waste.displayServiceInfo();
        waste.operateService();

        System.out.println("\n===== SIMULATION COMPLETE =====");
    }
}