package guava.list;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class List_Partition {

    /**
     * 对List切分子List，数字
     */
    @Test
    public void t1() {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> lists
                = Lists.partition(myList, 2);
        for (List<Integer> sublist : lists)
            System.out.println(sublist);
    }
    @Test
    public void t2() {
        List<Character> myList = Arrays.asList('H', 'E', 'L', 'L', 'O', 'G', 'E', 'E', 'K', 'S');
        List<List<Character>> lists
                = Lists.partition(myList, 3);
        for (List<Character> sublist : lists)
            System.out.println(sublist);
    }


}
