
public class ManualLoginTest {
    public static void main(String[] args) {
        
        String expectedUsername = "admin";
        String expectedPassword = "password123";

      
        String inputUsername = "admin";
        String inputPassword = "password123";

        if (inputUsername.equals(expectedUsername) && inputPassword.equals(expectedPassword)) {
            System.out.println("Test Passed: Login successful.");
        } else {
            System.out.println("Test Failed: Invalid credentials.");
        }
    }
}
