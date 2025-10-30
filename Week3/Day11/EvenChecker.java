public class EvenChecker {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runTests() {
        int[] testInputs = {0, 1, 2, -2, 99, 100};
        for (int input : testInputs) {
            System.out.println("Input: " + input + " | Is Even: " + isEven(input));
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}

