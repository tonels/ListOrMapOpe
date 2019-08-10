package list去重操作;

import com.google.common.collect.Lists;
import model.Book;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// list去重操作

public class ListRepeat {

    public static void main(String[] args) {

        List<Book> initList = init(); // 这里先初始化一个有重复的 list
        System.out.println("初始化的list为：");
        initList.forEach(b -> System.out.println(b));


        System.out.println("distinct1后的的list为：");
        List<Book> books = distinct1(initList);
        books.forEach(b -> System.out.println(b));

        System.out.println("distinct2后的的list为：");
        List<Book> books2 = distinct2(initList);
        books2.forEach(b -> System.out.println(b));

        System.out.println("distinct21后的的list为：");
        List<Book> books21 = distinct21(initList);
        books21.forEach(b -> System.out.println(b));

        System.out.println("distinct3后的的list为：");
        List<Book> books3 = distinct3(initList);
        books3.forEach(b -> System.out.println(b));


    }


    public static List<Book> init() {
        Book b1 = new Book().setBookId(1).setPrice(21.3).setLocation("sh").setAuthor("太宰治").setBookName("人间失格");
        Book b2 = new Book().setBookId(1).setPrice(21.36).setLocation("sd").setAuthor("村上").setBookName("当跑步时");
        Book b3 = new Book().setBookId(2).setPrice(13.3).setLocation("ah").setAuthor("黑泽").setBookName("七武士");
        Book b5 = new Book().setBookId(4).setPrice(26.3).setLocation("hb").setAuthor("张嘉译").setBookName("陪你到世界尽头");
        Book b4 = new Book().setBookId(3).setPrice(24.3).setLocation("hn").setAuthor("马克").setBookName("游记");
        Book b6 = new Book().setBookId(5).setPrice(28.3).setLocation("sh").setAuthor("契诃夫").setBookName("taozh");

//        Book b7 = new Book().setBookId(3).setPrice(24.3).setLocation("hn").setAuthor("马克").setBookName(null);
//        Book b8 = new Book().setBookId(5).setPrice(28.3).setLocation("sh").setAuthor("契诃夫").setBookName(null);

        // 需要注意的是，key 为 null 的时候，会出现空指针的异常

        Book b9 = new Book().setBookId(3).setPrice(24.3).setLocation("hn").setAuthor("马克").setBookName("  ");
        Book b10 = new Book().setBookId(5).setPrice(28.3).setLocation("sh").setAuthor("契诃夫").setBookName("   ");

        return Lists.newArrayList(b1, b2, b3, b4, b5, b6,/*b7,b8,*/b9, b10);
    }

    // list去重操作 一

    public static List<Book> distinct1(List<Book> list) {
        list = list.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Book::getBookId))),
                        ArrayList::new));
        return list;
    }

    // list去重操作 二

    public static List<Book> distinct2(List<Book> list) {
        List<Book> collect = list.stream().filter(distinctByKey(Book::getBookId)).collect(Collectors.toList());
        return collect;
    }

    // 除重 2.1
    public static List<Book> distinct21(List<Book> list) {
        List<Book> collect = list.stream().filter(distinctByKey(Book::getBookName)).collect(Collectors.toList());
        return collect;
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }


    // list去重操作 三

    public static List<Book> distinct3(List<Book> list) {
        Collection<List<Book>> values = list.stream().collect(Collectors.groupingBy(p -> p.getBookId())).values();
        List<Book> collect = values.stream().map(l -> l.get(0)).collect(Collectors.toList());
        return collect;
    }


}
