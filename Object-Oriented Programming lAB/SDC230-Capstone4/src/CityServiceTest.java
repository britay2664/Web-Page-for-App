public class CityServiceTest {

    public static void main(String[] args) {

        PoliceService police =
                new PoliceService("Norfolk Police", "Public Safety", 250);

        TransitService transit =
                new TransitService("HRT Transit", "Transportation", 180);

        WasteManagement waste =
                new WasteManagement("Waste Management", "Sanitation", 120);

        System.out.println("===== CITY SERVICES =====");
        System.out.println();

        police.operateService();
        transit.operateService();
        waste.operateService();

    }

}