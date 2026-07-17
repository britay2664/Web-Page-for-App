public class WasteManagement extends CityService {

    public WasteManagement(String serviceName, String department, int staffCount) {
        super(serviceName, department, staffCount);
    }

    @Override
    public void operateService() {
        System.out.println(serviceName + " collects trash and keeps the city clean.");
    }

}