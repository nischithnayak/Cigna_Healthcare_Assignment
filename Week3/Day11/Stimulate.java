

class CodeReview {
    public static void oldVersion() {
        System.out.println("Old Version: Hello World");
    }

    public static void newVersion() {
        System.out.println("New Version: Hello, World!");
    }

    public static void reviewChanges() {
        System.out.println("Review Summary:");
        System.out.println("- Added comma for clarity.");
        System.out.println("- Improved message formatting.");
    }

    public static void main(String[] args) {
        oldVersion();
        newVersion();
        reviewChanges();
    }
}

