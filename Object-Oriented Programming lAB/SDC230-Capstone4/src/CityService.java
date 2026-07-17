public class CityService {

    String serviceName;
    String department;
    int staffCount;

    public CityService(String serviceName, String department, int staffCount) {
        this.serviceName = serviceName;
        this.department = department;
        this.staffCount = staffCount;
    }

    public void operateService() {
        System.out.println(serviceName + " is operating city services.");
    }

}