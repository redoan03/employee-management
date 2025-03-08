import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    ArrayList<Employee> employees = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(String id) {
        for (Employee em : employees) {
            if (em.getID().equals(id)) {
                employees.remove(em);
                break;
            }
        }

    }

    public void updateEmployeeDetails(String id) {
        for (Employee em : employees) {
            if (em.getID().equals(id)) {
                System.out.println("Enter employee designation ");
                String newDesignation = input.nextLine();
                em.designation = newDesignation;
                System.out.println("Enter employee salary ");
                double newSalary = input.nextDouble();
                em.salary = newSalary;
                input.nextLine();
                System.out.println("Enter employee department ");
                String newDepartment = input.nextLine();
                em.department = newDepartment;

            }
        }

    }

    public Employee searchEmployeeById(String id) {
        boolean found = false;
        Employee emp = null;
        for (Employee em : employees) {
            if (em.getID().equals(id)) {
                emp = em;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found.");
        }
        return emp;

    }

    public void displayEmployeeDetails() {
        for (Employee em : employees) {
            em.displayDetails();
        }
    }

}
