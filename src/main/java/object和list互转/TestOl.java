package object和list互转;

import com.google.common.collect.Lists;
import model.Book;
import org.junit.Test;
import 关键字50个.extendsLs.ResultBean;

import java.util.List;

public class TestOl {

    private static List<Book> list;


    static {
        Book b1 = new Book().setBookId(1).setPrice(21.3).setLocation("sh").setAuthor("太宰治").setBookName("人间失格");
        Book b2 = new Book().setBookId(3).setPrice(21.3).setLocation("sd").setAuthor("村上").setBookName("当跑步时");
        Book b3 = new Book().setBookId(2).setPrice(13.3).setLocation("ah").setAuthor("黑泽").setBookName("七武士");
        Book b4 = new Book().setBookId(4).setPrice(26.3).setLocation("hb").setAuthor("张嘉译").setBookName("陪你到世界尽头");
        list = Lists.newArrayList(b1, b2, b3, b4);
    }

    /**
     * Object 转 list
     */
    @Test
    public void T1(){

        ResultBean ok = ResultBean.ok(list);
        List<Book> result = (List<Book>) ok.getResult();
        System.out.println(result);


    }




}
