public class CrewMember {

    private String name;
    private String role;
    private int yearsOfService;
    private String department;   // Bonus attribute

    public CrewMember(String name, String role, int yearsOfService, String department) {
        this.name = name;
        this.role = role;
        this.yearsOfService = yearsOfService;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getDepartment() {
        return department;
    }

}