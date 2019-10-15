package 国际换算;

import org.junit.Test;
import org.springframework.boot.convert.DurationFormat;

import java.time.Duration;
import java.util.regex.Pattern;

public class TimeTest {

    @Test
    public void t1(){
        String a = "ls";
        Duration duration = Duration.ofHours(49L);
        long l = duration.toDays();

        System.out.println(duration);
        System.out.println(l);
    }
}

//class TQ{
//
//    @DurationFormat(value = "")
//    private String time;
//
//}
