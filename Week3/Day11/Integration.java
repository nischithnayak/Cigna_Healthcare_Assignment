class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class CalculatorTest {
    public void unitTestAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("Unit Test - Add: " + (result == 5 ? "Passed" : "Failed"));
    }

    public void integrationTest() {
        Calculator calc = new Calculator();
        int sum = calc.add(10, 20);
        System.out.println("Integration Test - Add with external data: " + (sum == 30 ? "Passed" : "Failed"));
    }

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.unitTestAdd();
        test.integrationTest();
    }
}

