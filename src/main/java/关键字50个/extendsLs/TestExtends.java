package 关键字50个.extendsLs;

import com.google.common.collect.Lists;
import model.Book;

import java.util.List;

public class TestExtends {
    public static void main(String[] args) {

    }

    public static List<Book> init() {
        Book b1 = new Book().setBookId(1).setPrice(21.3).setLocation("sh").setAuthor("太宰治").setBookName("人间失格");
        Book b2 = new Book().setBookId(1).setPrice(21.36).setLocation("sd").setAuthor("村上").setBookName("当跑步时");
        Book b3 = new Book().setBookId(2).setPrice(13.3).setLocation("ah").setAuthor("黑泽").setBookName("七武士");

        return Lists.newArrayList(b1, b2, b3);
    }

    public ResultBean okTestRes(Book book){
        return ResultBean.ok();
    }

    public ResultBean errTestRes(){
        return ResultBean.error();
    }




}
