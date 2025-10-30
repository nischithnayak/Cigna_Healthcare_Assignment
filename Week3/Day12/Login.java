import  java.util.Scanner;
class LoginModule {
    public  static final String VALID_USER = "admin";
    public  static final String VALID_PASS = "password123";
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Username:");
        String user=sc.nextLine();
        System.out.print("Enter password:");
        String pass=sc.nextLine();

        if(user.isEmpty() || pass.isEmpty()){
            System.out.println("Error: Fields cannot be empty");
        }else if(user.equals(LoginModule.VALID_USER) && pass.equals(LoginModule.VALID_PASS)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid credentials");
        }
        sc.close();;
        }

}
