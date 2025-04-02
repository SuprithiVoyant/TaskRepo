package datetime;

import java.time.LocalTime;

public class LocalTImeEx {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        LocalTime customTime = LocalTime.of(2,30,24);
        System.out.println(customTime);

        //time in the string can also be parsed
        String time = "14:30:38";
        try {
            LocalTime parse = LocalTime.parse(time);
            System.out.println(parse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
