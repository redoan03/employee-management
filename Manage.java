import java.util.ArrayList;

public class Manage extends Employee {
    ArrayList<Employee> team = new ArrayList<>();
    EmployeeManagementSystem ems;
    Employee manager;

    public Manage() {
    }

    // public Manage(String id, String name, String designation, double salary,
    // String department) {
    // super(id, name, designation, salary, department);
    // }
    public Manage(EmployeeManagementSystem ems) {
        this.ems = ems;
    }

    public void setManagerId(String name, String id) {
        Employee e = ems.searchEmployeeById(name, id);
        if ("Manager".equals(e.getDesignation())) {
            this.manager = e;
            System.out.println("Your team are created.Now add developer.");
        } else {
            System.out.println("Manager not found!");
        }
    }

    public void addEmployee(String name, String id) {
        Employee e = ems.searchEmployeeById(name, id);
        if (e != null) {
            team.add(e);
        } else {
            System.out.println("This " + name + " and " + id + " number developer not found!");
        }
    }

    public void removeEmployee(String id) {
        for (Employee em : team) {
            if (em.getID().equals(id)) {
                team.remove(em);
                break;
            }
        }
    }

    @Override
    public void displayDetails() {
        if (manager != null) {
            System.out.println("Manager name: " + manager.getName());
            System.out.println("Manager id: " + manager.getID());

            for (Employee emp : team) {
                System.out.println("Developer name: " + emp.getName());
                System.out.println("Developer id: " + emp.getID());
            }
            System.out.println("    ");
        }
    }
}
