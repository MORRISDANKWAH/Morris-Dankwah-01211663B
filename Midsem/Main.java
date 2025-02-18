

package App;

import com.mycompany.convesions.CurrencyConverter;
import com.mycompany.convesions.Currencyconverter;
import com.mycompany.convesions.Distanceconverter;
import com.mycompany.convesions.Timeconverter;
import java.util.Scanner;

public class Main {

public class ConverterMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a converter:");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

           
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        Currencyconverter.main(null);
                        break;
                    case 2:
                        Distanceconverter.main(null);
                        break;
                    case 3:
                        Timeconverter.main(null);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
             
                System.err.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input from the scanner
            }
    }
}
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Currencyconverter converter = new Currencyconverter();

		
			System.out.print("Enter amount: ");
			double amount = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Enter currency to convert from (dollar, euro, yen, ghc): ");
			String fromCurrency = scanner.nextLine();

			System.out.print("Enter currency to convert to (dollar, euro, yen, ghc): ");
			String toCurrency = scanner.nextLine();

			double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
			System.out.println("Converted amount: " + String.format("%.2f", convertedAmount));
		 
	
		scanner.close();	
   
}


        Distanceconverter converter = new Distanceconverter();

     
            System.out.print("Enter distance: ");
            double distance = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter unit to convert from (meter, km, miles): ");
            String fromUnit = scanner.nextLine();

            System.out.print("Enter unit to convert to (meter, km, miles): ");
            String toUnit = scanner.nextLine();

            double convertedDistance = converter.convert(fromUnit, toUnit, distance);
            System.out.println("Converted distance: " + String.format("%.2f", convertedDistance));
        } catch(IllegalArgumentException | InputMismatchException e){
            System.err.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}


}



    

