package list常用操作;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_collect {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("d霍乱").setPrice(20.96);
        Book b2 = new Book().setBookId(2).setBookName("d百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("d盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("d小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("d周一十五").setPrice(56);
        Book b6 = new Book().setBookId(6).setBookName("d周一十四").setPrice(50);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5,b6);

        collectTest(list);


    }
    /**
     * toList
     */
    public static void collectTest(List<Book> list){
        List<String> collect = list.stream()
                .map(Book::getBookName)
                .collect(Collectors.toList());

        Set<String> collect1 = list.stream()
                .map(Book::getBookName)
                .collect(Collectors.toSet());

        Map<String, Double> collect2 = list.stream()
                .collect(Collectors.toMap(Book::getBookName, Book::getPrice));

        Map<String, String> collect3 = list.stream()
                .collect(Collectors.toMap(p->p.getBookName(), value->{
                    return value.toString();
                }));
        Map<String, Object> collect4 = list.stream()
                .collect(Collectors.toMap(p->p.getBookName(), value->{
                    return value.toString();
                }));

        for (Map.Entry<String, Object> entry : collect4.entrySet()) {
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }

//        TreeSet<Book> collect4 = list.stream()
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect4);

        // 验证所有的名字是否以 “d” 开头
        Map<Boolean, List<Book>> collect5 = list.stream()
                .collect(Collectors.groupingBy(p->p.getBookName().startsWith("d")));
        System.out.println("collect5 : " + collect5);

        // 将List中名字取出来，拼接 {，，，，}这种样式
        String collect6 = list.stream().map(p->p.getBookName()).collect(Collectors.joining(",", "{", "}"));
        System.out.println("collect6 : " + collect6);

        List<String> collect7 = Stream.of("1", "2", "3").map(x -> Arrays.asList(x)).reduce(new ArrayList<String>(), (y, z) -> {
            y.addAll(z);
            return y;
        });
        System.out.println("collect7 : " + collect7);
    }


}