import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<String> project = new ArrayList<>();
    EmployeeManagementSystem ems;
    Employee developer;

    public Developer() {
    }

    public Developer(EmployeeManagementSystem ems) {
        this.ems = ems;
    }

    public void setDeveloperId(String name, String id) {
        Employee e = ems.searchEmployeeById(name, id);
        if (e != null) {
            this.developer = e;
        } else {
            System.out.println("Developer not found!");
        }
    }

    public void addProject(String project) {
        this.project.add(project);
    }

    public void removeProject(String project) {
        this.project.remove(project);
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer name: " + developer.getName());
        System.out.println("Developer id: " + developer.getID());
        System.out.println("Developer department: " + developer.getDepartment());

        for (String pro : project) {
            System.out.println("Working on: " + pro);
        }

    }
}
