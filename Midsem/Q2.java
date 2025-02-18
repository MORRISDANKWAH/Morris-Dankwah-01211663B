import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousReading;
    int currentReading;
    String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        int unitsConsumed = currentReading - previousReading;
        double billAmount = 0;

        if (connectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 2.0 + (unitsConsumed - 100) * 4.50;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 2.0 + 100 * 4.50 + (unitsConsumed - 200) * 6.0;
            } else {
                billAmount = 100 * 2.0 + 100 * 4.50 + 300 * 6.0 + (unitsConsumed - 500) * 7.0;
            }
        } else
         {
            System.out.println("Invalid connection type.");
            return 0; 
        }

        return billAmount;
    }

    public void displayBill() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Bill Amount: Gh. " + calculateBill());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter consumer details:");
        System.out.print("Consumer No: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Previous Reading: ");
        int previousReading = scanner.nextInt();
        System.out.print("Current Reading: ");
        int currentReading = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Connection Type (Commercial): ");
        String connectionType = scanner.nextLine();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();
        scanner.close();
    }
}


