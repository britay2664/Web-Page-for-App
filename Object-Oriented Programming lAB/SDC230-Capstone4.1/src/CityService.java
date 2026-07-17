public class CityService {
    private String serviceName;
    private String department;
    private int staffCount;

    public CityService(String serviceName, String department, int staffCount) {
        this.serviceName = serviceName;
        this.department = department;
        this.staffCount = staffCount;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public void displayServiceInfo() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Department: " + department);
        System.out.println("Staff Count: " + staffCount);
    }

    public void operateService() {
        System.out.println(serviceName + " is providing a city service.");
    }
}