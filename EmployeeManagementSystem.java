import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    ArrayList<Employee> employees = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    String newDesignation, newDepartment;

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

    public void updateEmployeeDetails(String name, String id) {
        for (Employee em : employees) {
            if (em.getID().equals(id) && em.getName().equals(name)) {
                while (true) {
                    System.out.println("Select employee designation.Select 1 for Manager and 2 for Developer. ");
                    String select = input.nextLine();

                    switch (select) {
                        case "1":
                            newDesignation = " Manager";
                            break;
                        case "2":
                            newDesignation = " Developer ";
                            break;
                        default:
                            System.out.println("No designation is select.");

                    }
                    if (newDesignation != null) {
                        break;
                    } else {
                        System.out.println("Select designation aging.");
                    }
                }
                em.designation = newDesignation;

                System.out.println("Enter employee salary ");
                double newSalary = input.nextDouble();
                em.salary = newSalary;
                input.nextLine();

                while (true) {
                    System.out.println(
                            "Select employee designation.Select 1 for It , 2 for Web and 3 for Cyber and Security ");
                    String se = input.nextLine();

                    switch (se) {
                        case "1":
                            newDepartment = " It ";
                            break;
                        case "2":
                            newDepartment = " Web ";
                            break;
                        case "3":
                            newDepartment = " Cyber and Security ";
                            break;
                        default:
                            System.out.println("No department is select.");

                    }
                    if (newDepartment != null) {
                        break;
                    } else {
                        System.out.println("Select designation aging.");
                    }
                }
                em.department = newDepartment;

            }
        }

    }

    public Employee searchEmployeeById(String name, String id) {
        boolean found = false;
        Employee emp = null;
        for (Employee em : employees) {
            if (em.getID().equals(id) && em.getName().equals(name)) {
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

    public Employee idChecking(String id) {
        boolean found = false;
        Employee emp = null;
        for (Employee em : employees) {
            if (em.getID().equals(id)) {
                emp = em;
                found = true;
                break;
            }
        }
        return emp;
    }

    public void displayEmployeeDetails() {
        for (Employee em : employees) {
            em.displayDetails();
        }
    }

}
