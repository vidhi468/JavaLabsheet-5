// Q2: Medicine — Parameterized Constructor and this
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", Batch: " + batchNo
                + ", Price: Rs. " + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Paracetamol", "PCM101", 25.50);
        Medicine medicine2 = new Medicine("Cetirizine", "CTZ202", 18.00);
        medicine1.displayMedicine();
        medicine2.displayMedicine();
    }
}
