package timeOper;

import java.time.LocalDateTime;

public class TimeTest {


    public static void main(String[] args) {

        LocalDateTime n1 = LocalDateTime.now();
        LocalDateTime n2 = LocalDateTime.now().minusHours(50);
        System.out.println(n1.isAfter(n2));


    }
}
