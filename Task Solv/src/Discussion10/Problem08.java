package Discussion10;
class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public double calculatePay() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, int id,
                            String department,
                            double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id,
                            String department,
                            double hourlyRate,
                            int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public ContractEmployee(String name, int id,
                            String department,
                            String projectName,
                            double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }

    public String getProjectName() {
        return projectName;
    }
}

public class Problem08 {
    public static void main(String[] args) {

        FullTimeEmployee emp1 =
                new FullTimeEmployee(
                        "Rahim",
                        101,
                        "HR",
                        50000);

        PartTimeEmployee emp2 =
                new PartTimeEmployee(
                        "Karim",
                        102,
                        "Sales",
                        500,
                        80);

        ContractEmployee emp3 =
                new ContractEmployee(
                        "Sakib",
                        103,
                        "IT",
                        "Website Development",
                        75000);

        System.out.println("Full Time Employee");
        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculatePay());

        System.out.println();

        System.out.println("Part Time Employee");
        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculatePay());

        System.out.println();

        System.out.println("Contract Employee");
        emp3.displayInfo();
        System.out.println("Project: " + emp3.getProjectName());
        System.out.println("Salary: " + emp3.calculatePay());
    }
}
