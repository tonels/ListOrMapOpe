package 八_NewDate_Time_Api;

import java.time.*;
import java.util.SimpleTimeZone;

public class Java8Test {

    public static void main(String args[]) {
        Java8Test java8tester = new Java8Test();
        java8tester.testLocalDateTime();
    }

    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("LocalDateTime--Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("LocalDateTime--currentTime.toLocalDate(): " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("LocalDateTime--currentTime.withDayOfMonth(10).withYear(2012) : " + date2);

        // 2014-12-12
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("LocalDate--date3: " + date3);

        // 22:15
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("LocalDate--date4: " + date4);

        //20:15:30
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("LocalDate--date5: " + date5);
    }



}
