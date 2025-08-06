package skill3;

public class Reverse {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        System.out.print("Reversed Array: ");
        for (int i = original.length - 1; i >= 0; i--) {
            System.out.print(original[i] + " ");
        }
    }
}
