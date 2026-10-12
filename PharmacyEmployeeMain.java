// Q20: Pharmacy Employee Management System — Final Challenge
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0; // Class variable shared by all employees
    protected String department = "Pharmacy"; // Inherited by child classes
    String employmentType = "Full-time"; // Default/package-private member

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Negative salary rejected.");
        }
    }

    void displayEmployee() { // Default-access method
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: Rs. " + salary + ", Department: " + department
                + ", Type: " + employmentType);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayRole() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayRole() {
        displayEmployee();
        System.out.println("Role: Store Manager, Store Section: " + storeSection);
    }
}

class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees) {
        int total = 0; // Local variable used while processing the array
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayRole();
                total++;
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayRole();
                total++;
            }
        }
        System.out.println("Processed employees: " + total);
        System.out.println("Total Employee objects created: " + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(2001, "Aditi Sharma", 40000, "PH-7001"),
            new StoreManager(2002, "Vikram Rao", 52000, 3)
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}
