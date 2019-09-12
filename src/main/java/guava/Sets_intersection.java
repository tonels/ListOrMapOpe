package guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Sets_intersection {

    /**
     * Sets取交集，List没有，List里面有重复的元素
     */
    @Test
    public void t1(){
        Set<Integer> set1 = Sets.newHashSet(10, 20, 30, 40, 50);
        Set<Integer> set2 = Sets.newHashSet(30, 50, 70, 90);

        Set<Integer> answer = Sets.intersection(set1, set2);
        System.out.println("Set 1 intersection Set 2: " + answer);
    }
    @Test
    public void t2(){
        Set<String> set1 = Sets.newHashSet("G", "e", "e", "k", "s"); // 这里会自动除重
        Set<String> set2 = Sets.newHashSet("g", "f", "G", "e");

        Set<String> answer = Sets.intersection(set1, set2);
        System.out.println("Set 1 intersection Set 2: " + answer);
    }

}
