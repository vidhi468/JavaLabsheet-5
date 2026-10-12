// Q19: Hospital Staff Management — Integrated OOP
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0; // Shared count for all Employee objects

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayBaseRecord() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Age: " + age
                + ", Salary: Rs. " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayRecord() {
        displayBaseRecord();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayRecord() {
        displayBaseRecord();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                ((Doctor) staff[i]).displayRecord();
            } else if (staff[i] instanceof Pharmacist) {
                ((Pharmacist) staff[i]).displayRecord();
            }
        }
        System.out.println("Total employees: " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Nitin", 45, 1001, 85000, "Neurology"),
            new Pharmacist("Suman", 31, 1002, 36000, "PH-5582")
        };
        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}
