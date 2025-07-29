package project1;
import java.util.Scanner;
public class Sphere {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter radius of the sphere (in units): ");
	        double radius = scanner.nextDouble();

	        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

	        System.out.printf("Volume of the sphere: %.2f cubic units\n", volume);

	        scanner.close();
	    }
	}


