package skill3;

public class BiggestSmallest {
	    public static void main(String[] args) {
	        int[] numbers = {45, 12, 78, 34, 5, 90};
	        int min = numbers[0];
	        int max = numbers[0];

	        for (int num : numbers) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        System.out.println("Smallest: " + min);
	        System.out.println("Biggest: " + max);
	    }
	}


