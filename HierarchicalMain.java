// Q14: Hierarchical Inheritance — Person -> Doctor and Nurse
class Person { // Super class
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Doctor extends Person { // Child class 1
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person { // Child class 2
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Meera", 38, "Cardiology");
        Nurse nurse = new Nurse("Pooja", 29, "Emergency");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}
