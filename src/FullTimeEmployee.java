public class FullTimeEmployee implements Employee {
    private String name;
    private int id;
    private int salary;
    public FullTimeEmployee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public String getEmployeeType() {
        return "Full-Time";
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Type: Full-Time";
    }
}

