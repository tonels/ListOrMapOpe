package list常用操作;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
map 操作会把对象的某一列，取出放到 List 中
[a霍乱, s百年孤独, d盛世煮酒, f小熊和李, g周一十五]
 */
public class List_map {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("a霍乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("s百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("d盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("f小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("g周一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);

        mapTest(list);

    }

    private static void mapTest(List<Book> list) {
        List<String> temp = new ArrayList<>();
        for(Book b:list) {
            temp.add(b.getBookName());
        }
        System.out.println("temp="+temp.toString());

        List<String> collect = list
                .stream()
                .map(p->p.getBookName())
                .collect(Collectors.toList());
        System.out.println("collect = "+collect);

        List<String> collect1 = list
                .stream()
                .map(Book::getBookName)
                .collect(Collectors.toList());
        System.out.println("collect1.map = "+collect1);

        List<String> collect2 = list
                .stream()
                .map(p->{return p.getBookName();})
                .collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);
    }

}