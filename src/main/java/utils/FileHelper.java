package utils;

import java.io.*;

public class FileHelper {

    public static void save(Object data, String fileName) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            System.out.println("✅ Saved to file");
        } catch (Exception e) {
            System.out.println("❌ Save error: " + e.getMessage());
        }
    }

    public static Object load(String fileName) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (Exception e) {
            System.out.println("⚠️ No data file found, creating new...");
            return null;
        }
    }
}