import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String name, id, designation, department;
        double salary;
        Scanner input = new Scanner(System.in);
        Employee e = new Employee("101", "Abdul", "Manager", 12000, "IT");
        Employee e1 = new Employee("111", "Rakib", "Developer", 8000, "IT");
        Employee e2 = new Employee("112", "Kabir", "Developer", 12000, "Web");

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(e);
        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.displayEmployeeDetails();
        Manage m = new Manage(ems);
        Developer d = new Developer(ems);
        String s;

        do {
            int type;
            System.out.println(
                    " 1 for addEmployee.\n 2 for removeEmployee.\n 3 for searchEmployee.\n 4 for updateEmployeeDetails.\n 5 for Create a manager team.\n 6 for add developer in manager team. \n 7 for remove developer from the team.");
            System.out.println(" 8 for developer manage project. \n 9 for remove project from developer project list.");
            type = input.nextInt();
            input.nextLine();

            switch (type) {
                case 1:
                    System.out.println("Enter employee name ");
                    name = input.nextLine();
                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    System.out.println("Enter employee designation ");
                    designation = input.nextLine();
                    System.out.println("Enter employee salary ");
                    salary = input.nextDouble();
                    input.nextLine();
                    System.out.println("Enter employee department ");
                    department = input.nextLine();

                    Employee e4 = new Employee(id, name, designation, salary, department);
                    ems.addEmployee(e4);
                    ems.displayEmployeeDetails();
                    break;

                case 2:
                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    ems.removeEmployee(id);
                    ems.displayEmployeeDetails();
                    break;
                case 3:
                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    Employee emp = ems.searchEmployeeById(id);
                    if (emp != null) {
                        emp.displayDetails();
                    }
                    break;
                case 4:
                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    ems.updateEmployeeDetails(id);
                    ems.displayEmployeeDetails();
                    break;
                case 5:
                    System.out.println("Enter your manager id: ");
                    id = input.nextLine();
                    m.setManagerId(id);
                    break;

                case 6:
                    System.out.println("Enter Number of employee you want to add: ");
                    int n = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter your Developer id: ");
                        id = input.nextLine();
                        m.addEmployee(id);
                    }
                    m.displayDetails();
                    break;
                case 7:
                    System.out.println("Enter the developer id: ");
                    id = input.nextLine();
                    m.removeEmployee(id);
                    m.displayDetails();
                    break;
                case 8:
                    System.out.println("Enter the developer id: ");
                    id = input.nextLine();
                    d.setDeveloperId(id);
                    System.out.println("Enter Number of project you want to add: ");
                    int num = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < num; i++) {
                        System.out.println("Enter your project name: ");
                        String project = input.nextLine();
                        d.addProject(project);
                    }
                    d.displayDetails();
                    break;

                case 9:
                    System.out.println("Enter the project name: ");
                    String project = input.nextLine();
                    d.removeProject(project);
                    d.displayDetails();
                    break;

                default:
                    System.out.println("Wrong input.");

            }
            System.out.println("If you want to continue type y or Y");
            s = input.nextLine();
            System.out.println();

        } while ("y".equals(s) || "Y".equals(s));
        input.close();

    }

}

// javac Employee.java Manage.java Developer.java
// EmployeeManagementSystem.java Start.java
