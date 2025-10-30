//Write a program that reads a number from the user and divides 100 by it. Handle `InputMismatchException`, `ArithmeticException`, and throw a custom `DivideByZeroException` if input is zero.


import java.util.Scanner;
import java.util.InputMismatchException;
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                throw new DivideByZeroException("Cannot divide by zero.");
            }

            int result = 100 / num;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (DivideByZeroException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}