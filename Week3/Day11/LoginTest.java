public class LoginTest {
    public boolean functionalCheck(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public void nonFunctionalCheck(long responseTime) {
        if (responseTime < 2000) {
            System.out.println("Performance Test Passed");
        } else {
            System.out.println("Performance Test Failed");
        }
    }

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        boolean loginResult = test.functionalCheck("admin", "admin123");
        System.out.println("Functional Test: " + (loginResult ? "Passed" : "Failed"));

        test.nonFunctionalCheck(1500); // Simulated response time
    }
}
