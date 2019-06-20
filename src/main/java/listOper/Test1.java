package listOper;

import com.sun.tools.corba.se.idl.constExpr.GreaterThan;
import lombok.val;
import model.Book;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Book> originList = new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            val bookId = new Random().nextInt(50);
            Book b1 = new Book().setBookId(bookId).setAuthor("马尔克斯"+i).setBookName("百年孤独"+i).setLocation("霍乱城"+i).setDeci(BigDecimal.valueOf(25454.4)).setPrice(21.3);
            originList.add(b1);
        }

        // 方式一
        List<Book> b11 = Greater(originList, 25);
        b11.forEach(book -> System.out.println("方式一 list<book> : "+ book));
        System.out.println("--------------------------------------------------");
        // 方式一优化，可排序
        List<Book> b12 = GreaterAndSort(originList, 25);
        b12.forEach(book -> System.out.println("方式一优化，排序 list<book> : "+ book));


        System.out.println("--------------------------------------------------");
        // 方式二优化，可排序
        List<Book> b21 = GreaterLamda(originList, 25);
        b21.forEach(book -> System.out.println("方式二 list<book> : "+ book));

        System.out.println("--------------------------------------------------");
        // 方式二，integer
        List<Integer> b22 = GreaterLamda2(originList, 25);
        b21.forEach(book -> System.out.println("方式二 list<Integer> : "+ book));


    }


    // 方式一：直接遍历，判断取值。
    public static List<Book> Greater(List<Book> list,Integer num){
        ArrayList<Book> greater = new ArrayList<>();
        for(Book b:list){
            if(b.getBookId() >=num){
                greater.add(b);
            }
        }
        return greater;
    }

    // 方式一：直接遍历，判断取值。
    public static List<Book> GreaterAndSort(List<Book> list,Integer num){
            ArrayList<Book> greater = new ArrayList<>();
        for(Book b:list){
            if(b.getBookId() >=num){
                greater.add(b);
            }
        }
        // 排序
        Collections.sort(greater, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getBookId().compareTo(b1.getBookId());
            }
        });
        return greater;
    }


    // 方式二；
    public static List<Book> GreaterLamda(List<Book> originList,Integer num) {
        List<Book> collect = originList.parallelStream().filter(t -> t.getBookId() >= num)
                .sorted(Comparator.comparing(Book::getBookId).reversed())
                .collect(Collectors.toList());
        return collect;
    }

    // 方式二,示例
    public static List<Integer> GreaterLamda2(List<Book> originList,Integer num) {
        List<Book> collect = originList.parallelStream().filter(t -> t.getBookId() >= num)
                .sorted(Comparator.comparing(Book::getBookId).reversed())
                .collect(Collectors.toList());
        List<Integer> collect1 = originList.stream().filter(t -> t.getBookId() >= num).map(m -> m.getBookId() + 100).collect(Collectors.toList());


        return collect1;
    }



}
