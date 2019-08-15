package list常用操作.list_map_pojo互相转化;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import model.Book;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List_Bean_Map互转 {

    private static List<Book> list;

    private static Map<String,Object> map1;

    static {
        Book b1 = new Book().setBookId(1).setPrice(21.3).setLocation("sh").setAuthor("太宰治").setBookName("人间失格");
        Book b2 = new Book().setBookId(3).setPrice(21.3).setLocation("sd").setAuthor("村上").setBookName("当跑步时");
        Book b3 = new Book().setBookId(2).setPrice(13.3).setLocation("ah").setAuthor("黑泽").setBookName("七武士");
        Book b4 = new Book().setBookId(4).setPrice(26.3).setLocation("hb").setAuthor("张嘉译").setBookName("陪你到世界尽头");
        list = Lists.newArrayList(b1, b2, b3, b4);
    }

    static {
        map1 = Maps.newHashMap();

        map1.put("bookId",1);
        map1.put("bookName","人间失格");
        map1.put("author","太宰治");
        map1.put("price",21.3);
        map1.put("location","sh");
    }

    @Test
    public void pojoToJson(){
        Book book = list.get(0);
        String s = JSONUtil.toJsonPrettyStr(book);
        System.out.println(s);

//        {
//            "author": "太宰治",
//            "price": 21.3,
//            "location": "sh",
//            "bookName": "人间失格",
//            "bookId": 1
//        }
    }


    @Test
    public void mapStr(){
        System.out.println(map1);

//        {       author=太宰治,
//                price=21.3,
//                location=sh,
//                bookName=人间失格,
//                bookId=1
//        }
    }

    @Test
    public void pojoStr(){
        System.out.println(list.get(0));
//        Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null)
    }

    // 这里会出错
//    @Test
//    public void pojoToMap1(){
//        Book book = list.get(0);
//        Map<String, Object> map11 = MapUtil.createMap(Book.class);
//        System.out.println(map1);
//    }

    // java对象转Map1,hutool包下beanutil的使用
    @Test
    public void pojoToMap2(){
        Book book = list.get(0);
        Map<String, Object> map12 = BeanUtil.beanToMap(book);
        System.out.println(map12);
        // {bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null}
    }

    // java对象转Map1,jackson 包的使用的使用
    @Test
    public void pojoToMap3(){
        Book book = list.get(0);
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map13 = mapper.convertValue(book, new TypeReference<Map<String, Object>>() {});
        System.out.println(map13);
//        {bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null}
    }

    // map to bean 测试1
    @Test
    public void mapToBean1(){
        Book book = list.get(0);
        Book book1 = JSONUtil.toBean(JSONUtil.toJsonStr(book), Book.class);
        System.out.println(book1);
//        Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null)

    }

    // map to bean 测试2
    @Test
    public void mapToBean2(){
        Book book = list.get(0);
        ObjectMapper mapper = new ObjectMapper();
        final Book book2 = mapper.convertValue(map1, Book.class);
        System.out.println(book2);
//        Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null)

    }

//    List<T> Map<K,V>,先清楚自己需要转的数据结构，K，V个是什么东西

    // list to map 测试一
    @Test
    public void listTomap1(){

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Book::getBookId, Book::getBookName));
        System.out.println(collect);
//        {1=人间失格, 2=七武士, 3=当跑步时, 4=陪你到世界尽头}
    }

    // list to map 测试二,key值重复
    @Test
    public void listTomap2(){
        Map<Double, String> collect1 = list.stream().collect(Collectors.toMap(Book::getPrice, Book::getBookName,(oldValve,newValve) -> newValve));
        System.out.println(collect1);
//        {13.3=七武士, 26.3=陪你到世界尽头, 21.3=当跑步时}
    }

    // list to map 测试三，排序
    @Test
    public void listTomap3(){
        Map<Double, String> collect1 = list.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toMap(Book::getPrice, Book::getBookName, (oldValve, newValve) -> newValve,LinkedHashMap::new));
        System.out.println(collect1);
//       {13.3=七武士, 21.3=当跑步时, 26.3=陪你到世界尽头}
    }

    @Test
    public void listTomap4(){
        Map<String, Book> collect = list.stream().collect(Collectors.toMap(Book::getBookName, Function.identity()));
        System.out.println(collect);
//        {陪你到世界尽头=Book(bookId=4, bookName=陪你到世界尽头, author=张嘉译, location=hb, price=26.3, deci=null), 人间失格=Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null), 当跑步时=Book(bookId=3, bookName=当跑步时, author=村上, location=sd, price=21.3, deci=null), 七武士=Book(bookId=2, bookName=七武士, author=黑泽, location=ah, price=13.3, deci=null)}
    }


    @Test
    public void listTomap5(){
        Map<String, Book> map22= Maps.uniqueIndex(list, Book::getBookName);
        System.out.println(map22);
//        {
//             人间失格=Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null),
//              当跑步时=Book(bookId=3, bookName=当跑步时, author=村上, location=sd, price=21.3, deci=null),
//              七武士=Book(bookId=2, bookName=七武士, author=黑泽, location=ah, price=13.3, deci=null),
//              陪你到世界尽头=Book(bookId=4, bookName=陪你到世界尽头, author=张嘉译, location=hb, price=26.3, deci=null)
//      }
    }

    @Test
    public void listTomap6(){
        HashMap<String, Object> map = Maps.newHashMap();
        list.forEach(e -> map.put(e.getBookName(),e));
        System.out.println(map);
//        {
//             人间失格=Book(bookId=1, bookName=人间失格, author=太宰治, location=sh, price=21.3, deci=null),
//              当跑步时=Book(bookId=3, bookName=当跑步时, author=村上, location=sd, price=21.3, deci=null),
//              七武士=Book(bookId=2, bookName=七武士, author=黑泽, location=ah, price=13.3, deci=null),
//              陪你到世界尽头=Book(bookId=4, bookName=陪你到世界尽头, author=张嘉译, location=hb, price=26.3, deci=null)
//      }
    }




    // mapToList1 测试一

    @Test
    public void mapToList1(){
        Set<String> strings = map1.keySet();
        ArrayList<String> list = Lists.newArrayList(strings);
        System.out.println(list);
        //[author, price, location, bookName, bookId]
    }


    // mapToList2 测试二
    @Test
    public void mapToList2(){



    }




    // list to List 测试三，排序
    @Test
    public void listTomap7(){
        List<Book> collect = list.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toList());

        System.out.println(collect);
//       {13.3=七武士, 21.3=当跑步时, 26.3=陪你到世界尽头}
    }



}
