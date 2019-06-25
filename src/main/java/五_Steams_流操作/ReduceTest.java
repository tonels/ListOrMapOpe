package 五_Steams_流操作;

import model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ReduceTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            Integer bookId = new Random().nextInt(50);
            Book b1 = new Book().setBookId(bookId).setAuthor("马尔克斯"+i).setBookName("百年孤独"+i).setLocation("霍乱城"+i).setDeci(BigDecimal.valueOf(3)).setPrice(6);
            list.add(b1);
        }
        BigDecimal reduce = list.stream().map(p -> p.getDeci()).reduce(BigDecimal.TEN, BigDecimal::add);
        System.out.println(reduce);


    }
}
