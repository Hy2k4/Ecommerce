package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static String now() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }
}