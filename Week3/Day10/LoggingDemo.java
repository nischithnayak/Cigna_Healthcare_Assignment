//Create a login simulation that logs successful and failed attempts using `java.util.logging`.

import java.util.logging.*;

public class LoggingDemo {
    private static final Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);

        String username = "admin";
        String password = "1234";

        if (authenticate(username, password)) {
            logger.info("Login successful for user: " + username);
        } else {
            logger.warning("Login failed for user: " + username);
        }
    }

    public static boolean authenticate(String user, String pass) {
        return "admin".equals(user) && "1234".equals(pass);
    }
}
