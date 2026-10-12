// Q9: Public Access Specifier
class Hospital {
    // Public members can be accessed from other classes.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "CH101";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + ", Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "Community Hospital";
        hospital.hospitalCode = "COM202";
        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }
}
