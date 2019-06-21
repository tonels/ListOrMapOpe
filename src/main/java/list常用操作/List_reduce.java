package list常用操作;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * reduce 操作有三个重载方法，稍微复杂点
 *
 *
 */
public class List_reduce {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("霍乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("周一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);

        reduceTest();
    }

    public static void reduceTest(){
        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(10, (count, item) ->{
                    System.out.println("count:"+count);
                    System.out.println("item:"+item);
                    return count + item;
                } );
        System.out.println(reduce);

        Integer reduce1 = Stream.of(1, 2, 3, 4)
                .reduce(1, (x, y) -> x + y);
        System.out.println("reduce1 :  " + reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("1", (x, y) -> (x + "," + y));
        System.out.println("reduce2 ： " + reduce2);
    }

}