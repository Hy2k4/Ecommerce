package utils;

public class ValidationHelper {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isPositiveInt(int number) {
        return number > 0;
    }
}