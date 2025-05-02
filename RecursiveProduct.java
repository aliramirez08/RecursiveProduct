import java.util.Scanner;

public class RecursiveProduct {

    public static int computeProduct(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        return numbers[index] * computeProduct(numbers, index + 1);
    }

    public static int[] getUserInput() {
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                while (true) {
                    System.out.print("Number " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        numbers[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // discard invalid token
                    }
                }
            }
        }

        return numbers;
    }

    public static void displayResult(int product) {
        System.out.println("The product of the numbers is: " + product);
    }

    public static void main(String[] args) {
        int[] numbers = getUserInput();
        int product = computeProduct(numbers, 0);
        displayResult(product);
    }
}
