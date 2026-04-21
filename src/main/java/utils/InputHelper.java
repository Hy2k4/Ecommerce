package utils;

import java.util.Scanner;

public class InputHelper {

    public static int inputInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid number!");
            }
        }
    }

    public static double inputDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid number!");
            }
        }
    }

    public static String inputString(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}