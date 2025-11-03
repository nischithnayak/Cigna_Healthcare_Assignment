
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    private static final String VALID_USER="admin";
    private static final String VALID_PASS="password123";
    private static final String LOG_FILE ="login_log.csv";
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter username:");
        String user=sc.nextLine();

        System.out.println("Enter Password:");
        String pass=sc.nextLine();

        String result;
        if(user.isEmpty() || pass.isEmpty()){
            result="Error Empty field";
            System.out.println(result);
        }else if(user.equals(VALID_USER) && pass.equals(VALID_PASS)){
            result ="login succssful";
            System.out.println(result);
        }else{
            result="Invalid Credentials";
            System.out.println(result);
        }
        logAttempt(user,result);
        sc.close();

    }


    private static void logAttempt(String username, String result) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            out.println(timestamp + "," + username + "," + result);

        } catch (IOException e) {
            System.out.println("Failed to log attempt: " + e.getMessage());
        }
    }
    }
