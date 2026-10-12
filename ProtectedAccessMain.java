// Q12: Protected Access Specifier
class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId + ", Name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName); // Initialize the parent part
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayStaff(); // Inherited protected method
        System.out.println("License No: " + licenseNo);
        System.out.println("Inherited staff ID/name: " + staffId + " / " + staffName);
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(601, "Neha Singh", "PH-7781");
        pharmacist.displayPharmacist();
    }
}
