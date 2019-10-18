package list排序操作;

import com.google.common.collect.Lists;
import model.Book;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List排序 {

    private static List<Book> list;

    private static Map<String,Object> map1;

    static {
        Book b1 = new Book().setBookId(1).setPrice(21.3).setLocation("sh").setAuthor("太宰治").setBookName("人间失格");
        Book b2 = new Book().setBookId(3).setPrice(26.3).setLocation("sd").setAuthor("村上").setBookName("当跑步时");
        Book b3 = new Book().setBookId(2).setPrice(13.3).setLocation("ah").setAuthor("黑泽").setBookName("七武士");
        Book b4 = new Book().setBookId(4).setPrice(26.3).setLocation("hb").setAuthor("张嘉译").setBookName("陪你到世界尽头");
        list = Lists.newArrayList(b1, b2, b3, b4);
    }

    // list to List 测试三，排序
    @Test
    public void listTomap7(){
        List<Book> collect = list.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toList());

        collect.forEach(System.out::println);

//        Book(bookId=2, bookName=七武士, author=黑泽, location=ah, price=13.3, deci=null, birth=null)
//        Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null, birth=null)
//        Book(bookId=3, bookName=当跑步时, author=村上, location=sd, price=26.3, deci=null, birth=null)
//        Book(bookId=4, bookName=陪你到世界尽头, author=张嘉译, location=hb, price=26.3, deci=null, birth=null)
    }




}
