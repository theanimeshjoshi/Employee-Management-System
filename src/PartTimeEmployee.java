public class PartTimeEmployee implements Employee {
    private String name;
    private int id;
    private int hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return hourlyRate * hoursWorked;
    }
    public String getEmployeeType() {
        return "Part-Time";
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + getSalary() + ", Type: Part-Time";
    }
}

