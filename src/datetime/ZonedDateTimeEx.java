package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeEx {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

        System.out.println(ZonedDateTime.now(ZoneId.of("Japan")));

        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
