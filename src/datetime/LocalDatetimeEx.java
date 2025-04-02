package datetime;

import java.time.LocalDateTime;

public class LocalDatetimeEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.getHour());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMinute());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());

        LocalDateTime dateTime = LocalDateTime.parse("2024-04-02T14:30:00");
        System.out.println(dateTime);


    }
}
