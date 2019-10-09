package New_java8.五_Steams_流操作;

import com.google.common.collect.Lists;
import model.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ReduceTest {
    @Test
    public void t1(){
        ArrayList<Book> list = new ArrayList<>();

        Book b1 = new Book().setBookId(15).setAuthor("马尔克斯").setBookName("name1").setLocation("l1").setDeci(BigDecimal.valueOf(3)).setPrice(6);
        Book b2 = new Book().setBookId(27).setAuthor("马尔克斯").setBookName("name2").setLocation("l2").setDeci(BigDecimal.valueOf(5)).setPrice(8);
        Book b3 = new Book().setBookId(13).setAuthor("马尔克斯").setBookName("name3").setLocation("l3").setDeci(BigDecimal.valueOf(7)).setPrice(9);
        Book b4 = new Book().setBookId(07).setAuthor("马尔克斯").setBookName("name4").setLocation("l4").setDeci(BigDecimal.valueOf(8)).setPrice(2);

        Lists.newArrayList(b1,b2,b3,b4);

        BigDecimal reduce = BigDecimal.TEN;
        for (Book p : list) {
            BigDecimal deci = p.getDeci();
            reduce = reduce.add(deci);
            System.out.println(reduce);
        }
    }



}
