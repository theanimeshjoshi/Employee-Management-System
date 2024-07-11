import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        Employee e1 = new FullTimeEmployee("Sahil", 1, 50000);
        Employee e2 = new PartTimeEmployee("Kishan", 2, 20, 25);
        Employee e3 = new FullTimeEmployee("Aryan", 3, 20);
        Employee e4 = new PartTimeEmployee("Sanskriti", 4, 20, 25);


        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);
        ems.addEmployee(e4);

        System.out.println("All Employees:");
        ems.displayEmployees();
    }
}

