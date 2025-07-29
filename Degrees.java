package project1;
import java.util.Scanner;
public class Degrees {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double temperatureFahrenheit = scanner.nextDouble();

	        double temperatureCelsius = (5.0 / 9) * (temperatureFahrenheit - 32);

	        System.out.printf("Temperature in Celsius: %.2f°C\n", temperatureCelsius);
	        
	        scanner.close();
	    }
	}


