package list常用操作;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_flatMap {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("霍乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("周一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);

        flatMapTest(list);
    }

    
    private static void flatMapTest(List<Book> list) {
        List<String> collect = list
                .stream()
                .flatMap(Book -> Arrays.stream(Book.getBookName().split(" ")))
                .collect(Collectors.toList());
        System.out.println("collect="+collect);

        List<Stream<String>> collect1 = list
                .stream()
                .map(Book -> Arrays.stream(Book.getBookName().split(" ")))
                .collect(Collectors.toList());
        System.out.println("collect1="+collect1);

        List<String> collect2 = list
                .stream()
                .map(Book -> Book.getBookName().split(" "))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println("collect2="+collect2);

        List<String> collect3 = list
                .stream()
                .map(Book -> Book.getBookName().split(" "))
                .flatMap(str -> Arrays.asList(str).stream())
                .collect(Collectors.toList());
        System.out.println("collect3="+collect3);
    }
}
