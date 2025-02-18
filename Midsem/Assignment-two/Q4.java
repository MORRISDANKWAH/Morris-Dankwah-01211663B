import javax.swing.*;
import java.util.Scanner;

public class Main { new*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Voltage (V): ");
        double voltage = sc.nextDouble()
        System.out.print("Enter Back EMF (V): ");
        double backEMF = sc.nextDouble();
        System.out.print("Enter Motor Constant ");
        double motorConstant = sc.nextDouble();
        
        if ((voltage <= 0 || backEMF <= 0 || motorConstant <=)) {
            System.out.println("Motor Constant must be greater than zero.");
        }
        else {
            double speed = (voltage - backEMF) * motorConstant;
            System.out.println("Speed is %.if RPM%n" , speed);
        }
    }
}
