package utils;

public class ConsoleHelper {

    public static void line() {
        System.out.println("=================================");
    }

    public static void title(String text) {
        line();
        System.out.println("📌 " + text);
        line();
    }

    public static void success(String msg) {
        System.out.println("✅ " + msg);
    }

    public static void error(String msg) {
        System.out.println("❌ " + msg);
    }
}