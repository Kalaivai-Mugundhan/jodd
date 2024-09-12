import java.util.Scanner;

public class jodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: value of j
        System.out.println("Enter the value of j (number of odd numbers to print): ");
        int j = scanner.nextInt();

        // Initialize the first odd number
        int count = 0;
        int number = 1;

        System.out.println("The first " + j + " odd numbers are:");

        // Print first j odd numbers
        while (count < j) {
            System.out.print(number + " ");
            number += 2; // Increment to the next odd number
            count++;
        }
    }
}
