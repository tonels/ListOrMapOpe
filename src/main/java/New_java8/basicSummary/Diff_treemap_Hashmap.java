package New_java8.basicSummary;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class Diff_treemap_Hashmap {

    @Test
    public void tree(){
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
        System.out.println("初始化后,TreeMap元素个数为：" + treeMap.size());

        //新增元素:
        treeMap.put("hello",1);
        treeMap.put("world",1);
        treeMap.put("my",3);
        treeMap.put("name",4);
        treeMap.put("is",5);
        treeMap.put("jiaboyan",6);
        treeMap.put("i",6);
        treeMap.put("am",6);
        treeMap.put("a",6);
        treeMap.put("developer",1);
        System.out.println("添加元素后,TreeMap元素个数为：" + treeMap.size());
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }
        // key=a,value=6
        // key=am,value=6
        // key=developer,value=6
        // key=hello,value=1
        // key=i,value=6
        // key=is,value=5
        // key=jiaboyan,value=6
        // key=my,value=3
        // key=name,value=4
        // key=world,value=2


//        treeMap.treeMap

    }

    @Test
    public void hash(){
        Map<String,Integer> hashMap = Maps.newHashMap();
        System.out.println("初始化后,HashMap元素个数为：" + hashMap.size());

        //新增元素:
        hashMap.put("hello",1);
        hashMap.put("world",2);
        hashMap.put("my",3);
        hashMap.put("name",4);
        hashMap.put("is",5);
        hashMap.put("jiaboyan",6);
        hashMap.put("i",6);
        hashMap.put("am",6);
        hashMap.put("a",6);
        hashMap.put("developer",6);
        System.out.println("添加元素后,HashMap元素个数为：" + hashMap.size());
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }

        // 初始化后,HashMap元素个数为：0
        // 添加元素后,HashMap元素个数为：10
        // key=a,value=6
        // key=world,value=2
        // key=name,value=4
        // key=i,value=6
        // key=is,value=5
        // key=developer,value=6
        // key=hello,value=1
        // key=my,value=3
        // key=am,value=6
        // key=jiaboyan,value=6

    }

    // TODO: 2019/7/27   可以测出默认是按照key的序列化的hash值排序的
    @Test
    public void testSort1(){
        //第一种情况：Integer对象
        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"jiaboyan");
        treeMapFirst.put(6,"jiaboyan");
        treeMapFirst.put(3,"jiaboyan");
        treeMapFirst.put(10,"jiaboyan");
        treeMapFirst.put(7,"jiaboyan");
        treeMapFirst.put(13,"jiaboyan");
        System.out.println(treeMapFirst.toString());
        // 按照key 排序
//        {1=jiaboyan, 3=jiaboyan, 6=jiaboyan, 7=jiaboyan, 10=jiaboyan, 13=jiaboyan}

    }

    @Test
    public void testSort2(){
        //第一种情况：Integer对象
        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"v");
        treeMapFirst.put(6,"h");
        treeMapFirst.put(3,"h");
        treeMapFirst.put(10,"l");
        treeMapFirst.put(7,"e");
        treeMapFirst.put(13,"b");
        System.out.println(treeMapFirst.toString());
        // 按照key 排序
//        {1=jiaboyan, 3=jiaboyan, 6=jiaboyan, 7=jiaboyan, 10=jiaboyan, 13=jiaboyan}

    }




}
