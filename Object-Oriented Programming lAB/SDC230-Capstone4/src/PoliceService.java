public class PoliceService extends CityService {

    public PoliceService(String serviceName, String department, int staffCount) {
        super(serviceName, department, staffCount);
    }

    @Override
    public void operateService() {
        System.out.println(serviceName + " patrols neighborhoods and responds to emergencies.");
    }

}