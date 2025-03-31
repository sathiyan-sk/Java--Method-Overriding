class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getEmployeeDetails() {
        return "Name: " + name + ", ID: " + id;
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}

public class _1EmployeDetailsDemo {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("Robin", 011, 15.0, 40);
        Employee employee2 = new SalariedEmployee("Dane", 12, 45000.0);

        System.out.println(employee1.getEmployeeDetails()); // Prints details for HourlyEmployee
        System.out.println(employee2.getEmployeeDetails()); // Prints details of SalariedEmployee
    }
}
