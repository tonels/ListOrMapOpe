package guava.list;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Lists_reverse {

    /**
     * 逆序输出
     */
    @Test
    public void t1(){
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reverse = Lists.reverse(myList);
        System.out.println(reverse);
    }
}
