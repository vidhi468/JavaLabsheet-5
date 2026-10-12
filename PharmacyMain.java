// Q3: Pharmacy — Instance and Class Variables
class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0; // Shared by every Pharmacy object

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("HealthCare Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("City Medicos", "Haridwar");
        Pharmacy p3 = new Pharmacy("Wellness Pharmacy", "Dehradun");
        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
