import java.util.Scanner;

public class Ohmslaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the known parameters (Voltage[V], Current[A], Resistance[Ω]): ");
        String knownParameter = scanner.next();
        
        switch (knownParameter.toLowerCase()) {
            case "voltage":
                System.out.print("Enter Current (A): ");
                double current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                double resistance = scanner.nextDouble();
                double voltage = current * resistance;
                System.out.println("Calculated Voltage: " + voltage + " V");
                break;
            case "current":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.println("Calculated Current: " + current + " A");
                break;
            case "resistance":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.println("Calculated Resistance: " + resistance + " Ω");
                break;
            default:
                System.out.println("Invalid parameter.");
        }
        
        scanner.close();
    }
}
