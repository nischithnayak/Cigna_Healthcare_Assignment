
enum Status {
    DRAFT, READY, EXECUTED, CLOSED
}

public class TestCase {
    private String id, description, expectedResult, actualResult;
    private Status status;
    private boolean defectLogged;
    private List<String> history;

    public TestCase(String id, String description, String expectedResult) {
        this.id = id;
        this.description = description;
        this.expectedResult = expectedResult;
        this.status = Status.DRAFT;
        this.defectLogged = false;
        this.history = new ArrayList<>();
        history.add("Created in DRAFT status");
    }

    public void approve() {
        if (status == Status.DRAFT) {
            status = Status.READY;
            history.add("Approved and moved to READY status");
        } else {
            history.add("Approval failed: Invalid status transition");
        }
    }

    public void execute(String actualResult) {
        if (status != Status.READY) {
            history.add("Execution failed: Not in READY status");
            return;
        }
        this.actualResult = actualResult;
        status = Status.EXECUTED;
        history.add("Executed with actual result: " + actualResult);
        if (!actualResult.equals(expectedResult)) {
            defectLogged = true;
            history.add("Defect logged due to mismatch");
        } else {
            history.add("Test passed");
        }
    }

    public void reExecute(String actualResult) {
        if (!defectLogged) {
            history.add("Re-execution skipped: No defect logged");
            return;
        }
        this.actualResult = actualResult;
        history.add("Re-executed with actual result: " + actualResult);
        if (actualResult.equals(expectedResult)) {
            defectLogged = false;
            history.add("Defect resolved and test passed");
        } else {
            history.add("Defect persists");
        }
    }

    public void close() {
        if (status == Status.EXECUTED && !defectLogged) {
            status = Status.CLOSED;
            history.add("Test case closed successfully");
        } else {
            history.add("Closure failed: Defect unresolved or incorrect status");
        }
    }

    public void display() {
        System.out.println("\nTest Case ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        System.out.println("Status: " + status);
        System.out.println("Defect Logged: " + defectLogged);
        System.out.println("History:");
        for (String entry : history) {
            System.out.println(" - " + entry);
        }
    }

    public static void main(String[] args) {
        TestCase tc1 = new TestCase("TC001", "Verify login", "Login successful");
        tc1.approve();
        tc1.execute("Login failed");
        tc1.reExecute("Login successful");
        tc1.close();
        tc1.display();

        TestCase tc2 = new TestCase("TC002", "Verify logout", "Logout successful");
        tc2.approve();
        tc2.execute("Logout successful");
        tc2.close();
        tc2.display();
    }
}
