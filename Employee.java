public class Employee {
    protected String id, name;
    protected String designation, department;
    protected double salary;

    public Employee() {

    }

    public Employee(String id, String name, String designation, double salary, String department) {

        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void displayDetails() {

        System.out.println("Employee name: " + getName());
        System.out.println("Employee id: " + getID());
        System.out.println("Employee designation : " + getDesignation());
        System.out.println("Employee salary : " + getSalary());
        System.out.println("Employee department : " + getDepartment());
        System.out.println("------------------- ");

    }
}
