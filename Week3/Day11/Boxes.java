class Factorial {
    public static int compute(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input not allowed");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FactorialTest {
    public static void blackBoxTest() {
        System.out.println("Black-box Test:");
        System.out.println("Input: 5 | Expected: 120 | Actual: " + Factorial.compute(5));
    }

    public static void whiteBoxTest() {
        System.out.println("White-box Test:");
        System.out.println("Testing loop logic and edge cases...");
        System.out.println("Input: 0 | Expected: 1 | Actual: " + Factorial.compute(0));
        System.out.println("Input: 1 | Expected: 1 | Actual: " + Factorial.compute(1));
    }

    public static void main(String[] args) {
        blackBoxTest();
        whiteBoxTest();
    }
}
