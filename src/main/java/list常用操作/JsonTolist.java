package list常用操作;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import model.Book;

import java.util.Arrays;
import java.util.List;

public class JsonTolist {


    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("霍乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("百年孤独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("盛世煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("小熊和李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("周一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);

        String s = JSONUtil.toJsonStr(list);
        System.out.println("s 为" + s);
        /** 此时 S 已转成 String

         s = "[
                {"price":20.56,"bookName":"霍乱","bookId":1},
                {"price":30.36,"bookName":"百年孤独","bookId":2},
                {"price":31.26,"bookName":"盛世煮酒","bookId":3},
                {"price":30,"bookName":"小熊和李","bookId":4},
                {"price":56,"bookName":"周一十五","bookId":5}
            ]"

          */

        JSONArray objects = JSONUtil.parseArray(s);

        List<Book> books = JSONUtil.toList(objects, Book.class);// toList(JSONArray jsonArray, Class<T> elementType)

        System.out.println(books);


    }



}
