import java.util.Scanner;

<<<<<<< Updated upstream
public class SubtractionWithScannerAlternative {
=======
public class SubtractionWithScanner {
    // Static method to perform subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

>>>>>>> Stashed changes
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

<<<<<<< Updated upstream
        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Perform subtraction and display the result
        System.out.println("Result: " + (number1 - number2));

        // Perform subtraction
        int result = subtract(number1, number2);

        // Display the result
        System.out.println("Result: " + result);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
