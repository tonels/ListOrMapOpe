package New_java8.五_Steams_流操作;

import cn.hutool.core.util.StrUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

// todo 将两个数组拼成一个map
    @Test
    public void t1() {
        String[] col = {"Name", "id", "tra_id", "tra_amt"};
        String[] values = {"ss", "123", "a123", "450.00"};
        Map result = IntStream.range(0, col.length).boxed().collect(Collectors.toMap(i -> col[i], i -> values[i]));
        System.out.println(result);
    }

    @Test
    public void t2(){
        Random random1 = new Random();
        random1.ints()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void t3(){
        System.out.println("Parallel Processing 并行处理");
        List<String> list2 = Arrays.asList("asd", "saf", "", "fd", "  ", "  ", "fd", "hfg", "kjhl", "", "");

        long count1 = list2.parallelStream().filter(StrUtil::isBlankIfStr).count();
        long count2 = list2.stream().filter(StrUtil::isBlankIfStr).count();
        System.out.println("为空的值为 ：" + count1);
        System.out.println("为空的值为 ：" + count2);
    }






}
