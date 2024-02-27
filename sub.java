import java.util.Scanner;

public class SubtractionWithScannerAlternative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Perform subtraction and display the result
        System.out.println("Result: " + (number1 - number2));
    }
}
