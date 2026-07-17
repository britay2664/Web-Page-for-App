public class TransitService extends CityService {

    public TransitService(String serviceName, String department, int staffCount) {
        super(serviceName, department, staffCount);
    }

    @Override
    public void operateService() {
        System.out.println(serviceName + " transports citizens safely throughout the city.");
    }

}