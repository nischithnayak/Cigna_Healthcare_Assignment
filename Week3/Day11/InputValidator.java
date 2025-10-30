
public class InputValidator {
    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        validateAge(25); // Valid
        validateAge(-5); // Throws exception
    }
}
