// Q11: Default (Package-Private) Access Specifier
class Pharmacy {
    // No keyword means default/package-private access.
    String medicineName;
    double price;

    // Default/package-private constructor.
    Pharmacy() {
        medicineName = "Vitamin C";
        price = 120.00;
    }

    // Default/package-private method.
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", Price: Rs. " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println(pharmacy.medicineName);
        System.out.println(pharmacy.price);
        pharmacy.displayMedicine();
    }
}
