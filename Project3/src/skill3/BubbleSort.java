package skill3;

public class BubbleSort {
	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};
	        int n = arr.length;

	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-1-i; j++) {
	                if (arr[j] > arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }

	        System.out.print("Sorted Array: ");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }
	}


