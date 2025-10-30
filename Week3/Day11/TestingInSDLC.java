

public class TestingInSDLC {
    public static void printTestingActivity(String phase) {
        switch (phase.toUpperCase()) {
            case "REQUIREMENTS":
                System.out.println("Review requirements for testability.");
                break;
            case "DESIGN":
                System.out.println("Validate design through walkthroughs.");
                break;
            case "DEVELOPMENT":
                System.out.println("Perform unit testing.");
                break;
            case "TESTING":
                System.out.println("Execute integration and system tests.");
                break;
            case "DEPLOYMENT":
                System.out.println("Conduct acceptance testing.");
                break;
            case "MAINTENANCE":
                System.out.println("Perform regression testing.");
                break;
            default:
                System.out.println("Unknown phase.");
        }
    }

    public static void main(String[] args) {
        printTestingActivity("Design");
        printTestingActivity("Deployment");
    }
}
