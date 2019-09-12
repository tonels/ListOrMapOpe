package guava;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

public class Sets_diff {

    /**
     * 计算两个List差集，注意A，B集合的差集是不同的
     */
    @Test
    public void t1() {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Sets.newHashSet(1, 2, 3, 5, 7);
        Set<Integer> diff1 = Sets.difference(set1, set2);
        Set<Integer> diff2 = Sets.difference(set2, set1);
        System.out.println("Sets.difference(set1, set2):" + diff1); // 4，6
        System.out.println("Sets.difference(set2, set1):" + diff2); // 7
    }

    @Test
    public void t2() {
        Set<String> set1 = Sets.newHashSet("H", "E", "L", "L", "O", "G");
        Set<String> set2 = Sets.newHashSet("L", "I", "K", "E", "G");

        Set<String> diff1 = Sets.difference(set1, set2);
        Set<String> diff2 = Sets.difference(set2, set1);
        System.out.println("Sets.difference(set1, set2):" + diff1); //H，O
        System.out.println("Sets.difference(set2, set1)" + diff2); // I，K

    }

    @Test
    public void t3() {

    }


}
