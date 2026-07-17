public class WasteManagement extends CityService {

    public WasteManagement(String serviceName, String department, int staffCount) {
        super(serviceName, department, staffCount);
    }

    @Override
    public void operateService() {
        System.out.println(
                getServiceName()
                        + " is collecting trash and processing recyclable materials.");
    }
}