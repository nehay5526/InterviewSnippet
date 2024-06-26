package Other;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    
    public static void main(String[] args) {
        Timestamp timestamp = Timestamp.valueOf("2022-07-20T15:16:43.000Z");
        Timestamp res =  Timestamp.valueOf(timestamp.toLocalDateTime().minusHours(5).minusMinutes(30));
        System.out.println(res);
    }
}