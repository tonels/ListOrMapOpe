package guava.list;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList_ {

    public static <T> void iList(List<T> list) {
        ImmutableList<T> immutableList = ImmutableList.copyOf(list);
        System.out.println(immutableList);
    }

    public static void iList() {
        ImmutableList<String> immutableList = ImmutableList.of("Geeks", "For", "Geeks");
        System.out.println(immutableList);
    }

    @Test
    public void t1() {
        List<String> list = Lists.newArrayList("Geeks", "For", "Geeks");
        iList(list);
        iList();
    }

    @Test
    public void t2() {
        List<String> list = Lists.newArrayList("Geeks", "For", "Geeks");
        ImmutableList<String> iList = ImmutableList.<String>builder()
                .addAll(list)
                .add("Computer", "Portal")
                .build();
        System.out.println(iList);
    }

    @Test
    public void t3() {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        ImmutableList<String> iList = ImmutableList.copyOf(list);
        System.out.println(iList);
    }
}
