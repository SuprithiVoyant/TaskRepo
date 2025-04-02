package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatter {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate);
    }
}
