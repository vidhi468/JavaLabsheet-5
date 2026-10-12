// Q4: Patient Records — Object Array, Loop and Local Variable
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) { // i is a local loop variable
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Aarav", 22),
            new Patient(2, "Diya", 35),
            new Patient(3, "Kabir", 41),
            new Patient(4, "Meera", 28),
            new Patient(5, "Rohan", 53)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
