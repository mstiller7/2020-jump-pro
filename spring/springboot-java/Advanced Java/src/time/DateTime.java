package time;

import java.time.LocalDate;
import java.lang.*;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;

class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTimeTest LocalDT = new LocalDateTimeTest();
        LocalDT.testLocalDateTime();
    }

    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("Date1: " + date1);
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("Month: " + month + "  day: " + day + "  seconds: " + seconds);
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("Date2: " + date2);
        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("Date3: " + date3);
        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("Date4: " + date4);
        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("Date5: " + date5);
    }
}


class ZonedDateTimeTest {

    public static void main(String[] args) {
        ZonedDateTimeTest ZonedDT = new ZonedDateTimeTest();
        ZonedDT.testZonedDateTime();
    }

    public void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        System.out.println("Date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
