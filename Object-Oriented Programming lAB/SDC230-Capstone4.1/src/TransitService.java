public class TransitService extends CityService {

    public TransitService(String serviceName, String department, int staffCount) {
        super(serviceName, department, staffCount);
    }

    @Override
    public void operateService() {
        System.out.println(
                getServiceName()
                        + " is operating buses and transporting residents throughout the city.");
    }
}