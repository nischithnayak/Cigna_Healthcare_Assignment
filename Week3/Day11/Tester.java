
import java.util.ArrayList;
import java.util.List;

class Tester {
    private List<String> defectLog = new ArrayList<>();

    public void logDefect(String defect) {
        defectLog.add(defect);
        System.out.println("Defect logged: " + defect);
    }

    public void showDefects() {
        System.out.println("Defect List:");
        for (String defect : defectLog) {
            System.out.println("- " + defect);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.logDefect("Login button not responsive");
        tester.logDefect("Incorrect error message on invalid input");
        tester.showDefects();
    }
}
