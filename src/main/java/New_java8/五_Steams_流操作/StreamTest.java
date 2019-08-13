package New_java8.五_Steams_流操作;

import org.junit.Test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

// 将两个数组拼成一个map
    @Test
    public void t1() {
        String[] col = {"Name", "id", "tra_id", "tra_amt"};
        String[] values = {"ss", "123", "a123", "450.00"};
        Map result = IntStream.range(0, col.length).boxed().collect(Collectors.toMap(i -> col[i], i -> values[i]));
        System.out.println(result);
    }

}
