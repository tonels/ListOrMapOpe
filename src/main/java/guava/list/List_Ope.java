package guava.list;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import list互转.model.Per;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_Ope {

    private static List<Per> list;

    static
    {
        LocalDateTime now = LocalDateTime.now();
        Per p1 = new Per().setPerId(1l).setAge(12).setName("tets").setBirth(now.minusDays(50)).setDeath(now.plusMonths(378));
        Per p2 = new Per().setPerId(2l).setAge(28).setName("tets2").setBirth(now.minusDays(25)).setDeath(now.plusMonths(358));
        Per p3 = new Per().setPerId(3l).setAge(25).setName("tets3").setBirth(now.minusDays(27)).setDeath(now.plusMonths(338));
        Per p4 = new Per().setPerId(4l).setAge(14).setName("tets4").setBirth(now.minusDays(37)).setDeath(now.plusMonths(348));
        list = Lists.newArrayList(p1,p2,p3,p4);
    }

    /**
     * 这里只能去除null,无法空串
     */
    @Test
    public void t1(){
        List<String> names = Lists.newArrayList("","  ","John", null, "Adam", null, "Jane","");
        Iterables.removeIf(names, Predicates.isNull());
        names.forEach(System.out::println);
    }

    /**
     * list过滤
     */
    @Test
    public void t2(){
        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Iterable<String> result = Iterables.filter(names, Predicates.containsPattern("a"));
        result.forEach(System.out::println);
    }
    // 包含"J",或者不包括"a"
    @Test
    public void t21(){
        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Iterable<String> result = Iterables.filter(names, Predicates.or(Predicates.containsPattern("J"), Predicates.not(Predicates.containsPattern("a"))));
        result.forEach(System.out::println);
    }
    //
    @Test
    public void t3(){
        List<Per> pers = Lists.newArrayList(list);
        list.forEach(e ->{
            if (e.getAge()>15) {
                pers.remove(e);
            }
        });
        pers.forEach(System.out::println);
    }
    // java8 stream 过滤
    @Test
    public void t4(){
        final List<Per> list1 = list.stream().filter(e -> e.getAge() > 20).collect(Collectors.toList());
        list1.forEach(System.out::println);
    }

    // guava  过滤
    @Test
    public void t5(){
        final Iterable<Per> filter = Iterables.filter(list, Predicates.notNull());
        filter.forEach(System.out::println);
    }




}
