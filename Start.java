import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String name, id = null;
        String designation = null;
        String department = null;
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

        while (true) {
            String type;
            System.out.println(
                    " Select 1 for add Employee.\n Select 2 for remove Employee.\n Select 3 for search Employee.\n Select 4 for update EmployeeDetails.\n Select 5 for Create a manager team.\n Select 6 for add developer in manager team. \n Select 7 for remove developer from the team.");
            System.out.println(
                    " Select 8 for developer manage project. \n Select 9 for remove project from developer project list.\n Select 0 for exit from the program.");
            type = input.nextLine();

            switch (type) {
                case "1":
                    System.out.println("Enter employee name ");
                    name = input.nextLine();

                    while (true) {
                        System.out.println("Enter employee id number ");
                        String id_num = input.nextLine();
                        Employee empl = ems.idChecking(id_num);
                        if (empl == null) {
                            id = id_num;
                            break;
                        } else {
                            System.out.println("This id is already exists.Please enter id number again.");
                        }
                    }

                    while (true) {
                        System.out.println("Select employee designation.Select 1 for Manager and 2 for Developer. ");
                        String select = input.nextLine();

                        switch (select) {
                            case "1":
                                designation = " Manager";
                                break;
                            case "2":
                                designation = " Developer ";
                                break;
                            default:
                                System.out.println("No designation is select.");

                        }
                        if (designation != null) {
                            break;
                        } else {
                            System.out.println("Select designation aging.");
                        }
                    }

                    System.out.println("Enter employee salary ");
                    salary = input.nextDouble();
                    input.nextLine();

                    while (true) {
                        System.out.println(
                                "Select employee designation.Select 1 for It , 2 for Web and 3 for Cyber and Security ");
                        String se = input.nextLine();

                        switch (se) {
                            case "1":
                                department = " It ";
                                break;
                            case "2":
                                department = " Web ";
                                break;
                            case "3":
                                department = " Cyber and Security ";
                                break;
                            default:
                                System.out.println("No department is select.");

                        }
                        if (department != null) {
                            break;
                        } else {
                            System.out.println("Select department aging.");
                        }
                    }

                    Employee e4 = new Employee(id, name, designation, salary, department);
                    ems.addEmployee(e4);
                    ems.displayEmployeeDetails();
                    break;

                case "2":
                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    ems.removeEmployee(id);
                    ems.displayEmployeeDetails();
                    break;
                case "3":
                    System.out.println("Enter employee name ");
                    name = input.nextLine();

                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    Employee emp = ems.searchEmployeeById(name, id);
                    if (emp != null) {
                        emp.displayDetails();
                    }
                    break;
                case "4":
                    System.out.println("Enter employee name ");
                    name = input.nextLine();

                    System.out.println("Enter employee id ");
                    id = input.nextLine();
                    ems.updateEmployeeDetails(name, id);
                    ems.displayEmployeeDetails();
                    break;
                case "5":
                    System.out.println("Enter employee name ");
                    name = input.nextLine();
                    System.out.println("Enter your manager id: ");
                    id = input.nextLine();
                    m.setManagerId(name, id);
                    break;

                case "6":
                    System.out.println("Enter Number of employee you want to add: ");
                    int n = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter employee name ");
                        name = input.nextLine();
                        System.out.println("Enter your Developer id: ");
                        id = input.nextLine();
                        m.addEmployee(name, id);
                    }
                    m.displayDetails();
                    break;
                case "7":
                    System.out.println("Enter the developer id: ");
                    id = input.nextLine();
                    m.removeEmployee(id);
                    m.displayDetails();
                    break;
                case "8":
                    System.out.println("Enter employee name ");
                    name = input.nextLine();
                    System.out.println("Enter the developer id: ");
                    id = input.nextLine();
                    d.setDeveloperId(name, id);
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

                case "9":
                    System.out.println("Enter the project name: ");
                    String project = input.nextLine();
                    d.removeProject(project);
                    d.displayDetails();
                    break;

                case "0":
                    input.close();
                    return;

                default:
                    System.out.println("Wrong input.");

            }
        }
    }

}

// javac Employee.java Manage.java Developer.java
// EmployeeManagementSystem.java Start.java
