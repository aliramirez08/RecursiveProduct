import java.util.Scanner;

/**
 * A Java program that computes the product of five integers entered by the user
 * using a recursive method.
 */
public class RecursiveProduct {

    /**
     * Recursively computes the product of elements in an integer array.
     *
     * @param numbers the array of integers
     * @param index   the current index to start multiplication from
     * @return the product of the array elements from the given index to the end
     */
    public static int computeProduct(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        return numbers[index] * computeProduct(numbers, index + 1);
    }

    /**
     * Prompts the user to enter five integers and returns them as an array.
     *
     * @return an array of five validated integers entered by the user
     */
    public static int[] getUserInput() {
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter an integer: ");
                    scanner.next();
                }
                numbers[i] = scanner.nextInt();
            }
        }
        return numbers;
    }

    /**
     * Displays the computed product of the provided integer array.
     *
     * @param product the product to be displayed
     */
    public static void displayResult(int product) {
        System.out.println("The product of the numbers is: " + product);
    }

    /**
     * Main method orchestrating the input, processing, and output of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = getUserInput();
        int product = computeProduct(numbers, 0);
        displayResult(product);
    }
}
