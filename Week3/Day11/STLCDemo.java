class STLCPhase {
    String name;
    String deliverable;

    STLCPhase(String name, String deliverable) {
        this.name = name;
        this.deliverable = deliverable;
    }

    void showDetails() {
        System.out.println("Phase: " + name + " | Deliverable: " + deliverable);
    }
}

public class STLCDemo {
    public static void main(String[] args) {
        STLCPhase[] phases = {
            new STLCPhase("Requirement Analysis", "Requirement Traceability Matrix"),
            new STLCPhase("Test Planning", "Test Plan Document"),
            new STLCPhase("Test Case Design", "Test Cases"),
            new STLCPhase("Environment Setup", "Test Environment Setup Checklist"),
            new STLCPhase("Test Execution", "Defect Reports"),
            new STLCPhase("Test Closure", "Test Summary Report")
        };

        for (STLCPhase phase : phases) {
            phase.showDetails();
        }
    }
}
