package datetime;

import java.time.LocalDate;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //now can have n number of methods
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.isLeapYear());

        //finding the past days
        LocalDate minus = now.minusDays(1);
        System.out.println(minus);

        LocalDate minusMonths = now.minusMonths(1);
        System.out.println(minusMonths);

        //other methods
        if(now.isAfter(minus)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(now.isBefore(minus)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        LocalDate myDate = LocalDate.of(2002, 8, 24);
        System.out.println(myDate);
    }
}
