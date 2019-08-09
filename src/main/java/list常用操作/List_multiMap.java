package list常用操作;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Maps;
import model.Book;

import java.util.*;
import java.util.stream.Collectors;


/*
map 操作会把对象的某一列，取出放到 List 中
[a霍乱, s百年孤独, d盛世煮酒, f小熊和李, g周一十五]
 */
public class List_multiMap {

    public static void main(String[] args) {

        Book b1 = new Book().setBookId(1).setBookName("a,霍,乱").setPrice(20.56);
        Book b2 = new Book().setBookId(2).setBookName("s,百年孤,独").setPrice(30.36);
        Book b3 = new Book().setBookId(3).setBookName("d,盛世,煮酒").setPrice(31.26);
        Book b4 = new Book().setBookId(4).setBookName("f,小熊和,李").setPrice(30);
        Book b5 = new Book().setBookId(5).setBookName("g,周,一十五").setPrice(56);

        List<Book> list= Arrays.asList(b1, b2, b3, b4, b5);
        mapTest(b1);
    }

    private static void mapTest(Book book) {
        JSON parse = JSONUtil.parse(book);

        HashMap<String, Object> map = Maps.newHashMap();
        List<String> split1 = StrUtil.split(book.getBookName(), ',');
//        split1.stream().collect(Collectors.toMap("name",split1.toString());
        final String[] split = book.getBookName().split(",");

        System.out.println(parse);

    }

}