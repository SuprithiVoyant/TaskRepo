package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class DurationEx {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant then = now.minusNanos(199);

        System.out.println(Duration.between(now, then));

        LocalDate startDate = LocalDate.of(2000, 2, 15);
        LocalDate endDate = LocalDate.now();

        System.out.println(Period.between(startDate, endDate));
    }
}
