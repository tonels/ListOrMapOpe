package New_java8.list常用操作;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class List_filter {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("a霍乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("s百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("a盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("a小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("s周一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);
        filterTest(list);
    }

    // 方式一

    private static void filterTest(List<Book> list) {
        List<Book> temp = new ArrayList<Book>();
        for(Book b:list) {
            if (b.getPrice() > 26){
                temp.add(b);
            }


        }
        temp.forEach(System.out::print);
        System.out.println("*********************************************************");
        // 方式二
        final List<Book> collect = list.stream()
                .filter(b -> (b.getPrice() > 26) && b.getBookName().startsWith("a"))
                .collect(Collectors.toList());
        collect.forEach(System.out::print);
        System.out.println("*********************************************************");

    // 方式三
        List<Book> collect1 = list.stream()
                .filter(b ->{
                    if (b.getPrice() > 26 ) {
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList());
       collect1.forEach(System.out::print);
        System.out.println("*********************************************************");
    }

}
