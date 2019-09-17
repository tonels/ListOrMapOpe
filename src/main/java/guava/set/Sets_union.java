package guava.set;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

public class Sets_union {
    @Test
    public void t1(){
        Set<Integer> set1 = Sets.newHashSet(5,8,3,6,9);
        Set<Integer> set2 = Sets.newHashSet(3, 5, 7, 9);

        Set<Integer> answer = Sets.union(set1, set2);
        Set<Integer> answer2 = Sets.union(set2, set1);

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 1 union Set 2: " + answer);
        System.out.println("Set 2 union Set 1: " + answer2);
    }

}
