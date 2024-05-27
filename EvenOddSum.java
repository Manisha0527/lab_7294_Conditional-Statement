import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces (press Enter to finish):");

        // Read the input line
        String inputLine = scanner.nextLine();

        // Split the input line into individual integers
        String[] numbers = inputLine.split("\\s+");

        int evenSum = 0;
        int oddSum = 0;

        // Iterate through the numbers array
        for (String num : numbers) {
            // Convert each string representation of a number to an integer
            int n = Integer.parseInt(num);
            
            // Check if the number is even
            if (n % 2 == 0) {
                // Add to the even sum
                evenSum += n;
            } else {
                // Add to the odd sum
                oddSum += n;
            }
        }

        // Print the sums
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}