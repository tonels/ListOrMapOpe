package list常用操作.list元素聚合操作;

import com.google.common.collect.Lists;
import model.Item;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class Qw {
    private static List<Item> list;
    
    static
    {
        final Item item1 = new Item().setStart(LocalDateTime.now()).setEnd(LocalDateTime.now().minusHours(2));
        final Item item2 = new Item().setStart(LocalDateTime.now()).setEnd(LocalDateTime.now().minusHours(3));
        final Item item3 = new Item().setStart(LocalDateTime.now()).setEnd(LocalDateTime.now().minusHours(5));
        final Item item4 = new Item().setStart(LocalDateTime.now()).setEnd(LocalDateTime.now().minusHours(15));
        final Item item5 = new Item().setStart(LocalDateTime.now()).setEnd(LocalDateTime.now().minusHours(10));
        list = Lists.newArrayList(item1,item2,item3,item4,item5);
    }

    @Test
    public void te(){
        list.forEach(System.out::println);

//        Item(start=2019-08-13T16:18:29.691, end=2019-08-13T14:18:29.692, total=null)
//        Item(start=2019-08-13T16:18:29.692, end=2019-08-13T13:18:29.692, total=null)
//        Item(start=2019-08-13T16:18:29.692, end=2019-08-13T11:18:29.692, total=null)
//        Item(start=2019-08-13T16:18:29.692, end=2019-08-13T01:18:29.692, total=null)
//        Item(start=2019-08-13T16:18:29.692, end=2019-08-13T06:18:29.692, total=null)
    }

    @Test
    public void tr(){
        final LocalDateTime fromDate = LocalDateTime.now();
        final LocalDateTime toDate = LocalDateTime.now().plusHours(56);

        long minutes = ChronoUnit.MINUTES.between(fromDate, toDate);
        long hours = ChronoUnit.HOURS.between(fromDate, toDate);

        System.out.println(minutes);
        System.out.println(hours);
//        3360
//        56
    }

    @Test
    public void tr2(){
        final LocalDateTime fromDate = LocalDateTime.now();
        final LocalDateTime toDate = LocalDateTime.now().plusHours(56);

        final Duration duration = Duration.between(fromDate, toDate);

        final long minuts = duration.toMinutes();
        final long hours = duration.toHours();

        System.out.println(minuts);
        System.out.println(hours);

//        3360
//        56
    }

    @Test
    public void longTodate(){

    }


    @Test
    public void listTest1(){
        final List<Item> collect = list.stream().map(e -> e.setTotal(Duration.between(e.getEnd(), e.getStart()).toMinutes())).collect(Collectors.toList());
        collect.forEach(System.out::println);

//        Item(start=2019-08-13T17:37:16.177, end=2019-08-13T15:37:16.178, total=119)
//        Item(start=2019-08-13T17:37:16.178, end=2019-08-13T14:37:16.178, total=180)
//        Item(start=2019-08-13T17:37:16.178, end=2019-08-13T12:37:16.178, total=300)
//        Item(start=2019-08-13T17:37:16.178, end=2019-08-13T02:37:16.178, total=900)
//        Item(start=2019-08-13T17:37:16.178, end=2019-08-13T07:37:16.178, total=600)

    }










}
