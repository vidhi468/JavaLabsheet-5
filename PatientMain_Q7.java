// Q7: Encapsulated Patient — Validation
class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age rejected: " + age);
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight rejected: " + weight);
        }
    }

    public void displayPatient() {
        System.out.println("Name: " + patientName + ", Age: " + age + ", Weight: " + weight + " kg");
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Ananya", 21, 52.5);
        patient.setAge(22);       // Valid update
        patient.setAge(-4);       // Invalid update
        patient.setWeight(54.0);  // Valid update
        patient.setWeight(0);     // Invalid update
        patient.displayPatient();
    }
}
