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

//        filterTest(list);
//        mapTest(list);
        flatMapTest(list);
//        reduceTest();
//        collectTest(list);


    }

    private static void println(List<Book> list) {
        for(Book b:list) {
            System.out.println(b.getBookId()+"-"+b.getBookName()+"-"+b.getPrice());
        }
    }

    // filter age > 13 and name = d
    private static void filterTest(List<Book> list) {
        List<Book> temp = new ArrayList<Book>();
        for(Book b:list) {
            if (b.getPrice() > 26 ){
                temp.add(b);
            }
        }
        println(temp);

        final List<Book> collect = list.stream()
                .filter(b -> (b.getPrice() > 26))
                .collect(Collectors.toList());
        println(collect);

        List<Book> collect1 = list.stream()
                .filter(b ->{
                    if (b.getPrice() > 26 ) {
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList());
        println(collect1);
    }


    // map
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

    // flatMap
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

    // reduce
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
        System.out.println(reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("1", (x, y) -> (x + "," + y));
        System.out.println(reduce2);
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
                    return value+"1";
                }));
        for (Map.Entry<String, String> entry : collect3.entrySet()) {
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }

        //TreeSet<Book> collect4 = list.stream()
        //        .collect(Collectors.toCollection(TreeSet::new));
        //System.out.println(collect4);

        Map<Boolean, List<Book>> collect5 = list.stream()
                .collect(Collectors.groupingBy(p->"d".equalsIgnoreCase(p.getBookName())));
        System.out.println(collect5);

        String collect6 = list.stream()
                .map(p->p.getBookName())
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect6);

        List<String> collect7 = Stream.of("1", "2", "3").map(x -> Arrays.asList(x)).reduce(new ArrayList<String>(), (y, z) -> {
            y.addAll(z);
            return y;
        });
        System.out.println(collect7);
    }


}