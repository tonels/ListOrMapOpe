package basicTest;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import lombok.Data;
import lombok.experimental.Accessors;
import model.HashcodeModel;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Classtest {

    @Test
    public void t1(){
        HashcodeModel hashcodeModel = new HashcodeModel();
        hashcodeModel.hashCode();
        System.out.println(hashcodeModel.hashCode());

        hashcodeModel.setId("asd");
        System.out.println(hashcodeModel.hashCode());
    }

    @Test
    public void t2(){
        ArrayList<String> arList = Lists.newArrayList();

        LinkedList<String> lkList = Lists.newLinkedList();

        Vector<String> vector = new Vector<>();
    }

    @Test
    public void t3(){
        ArrayList<String> list = Lists.newArrayList();
//        EnumSet<HashcodeModel> es1 = Sets.newEnumSet(list, HashcodeModel.class);


        HashSet<String> hashSet = Sets.newHashSet();

        TreeSet<String> treeSet = Sets.newTreeSet();
    }

    @Test
    public void t4(){

        HashMap< String, String> hashMap = Maps.newHashMap();

        LinkedHashMap<String, String> linkedHashMap = Maps.newLinkedHashMap();

        ConcurrentMap<String, String> concurrentMap = Maps.newConcurrentMap();

        TreeMap<String, String> treeMap = Maps.newTreeMap();

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        Hashtable<String, String> hashtable = new Hashtable<>();

        WeakHashMap weakHashMap = new WeakHashMap<>();
    }

    @Test
    public void t5(){
        ArrayList<Df> arrayList = Lists.newArrayList();
        LinkedList<Df> linkedList = Lists.newLinkedList();

        for (int i = 0; i < 500000; i++) {
            Df df = new Df().setId(i).setName("n" + i);
            arrayList.add(df);
            linkedList.add(df);
        }

        // 遍历操作比较
        long x = System.currentTimeMillis();
        arrayList.stream().map(e -> {
            e.setId(e.id + 1);
            return e;
        }).collect(Collectors.toList());
        System.out.println("arrayList 操作单个元素：" + (System.currentTimeMillis() - x));

        long x2 = System.currentTimeMillis();
        linkedList.stream().map(e -> {
            e.setId(e.id + 1);
            return e;
        }).collect(Collectors.toList());
        System.out.println("LinkedList 操作单个元素："+(System.currentTimeMillis() - x2));

    }

    @Test
    public void t6(){
        ArrayList<Df> arrayList = Lists.newArrayList();
        LinkedList<Df> linkedList = Lists.newLinkedList();

        for (int i = 0; i < 50000; i++) {
            Df df = new Df().setId(i).setName("n" + i);
            arrayList.add(df);
            linkedList.add(df);
        }

        // 遍历操作比较
        long x11 = System.currentTimeMillis();
        arrayList.stream().map(e -> {
            e.setId(e.id + 1);
            return e;
        }).collect(Collectors.toList());
        System.out.println("arrayList 遍历修改单条数据" + (System.currentTimeMillis() - x11));

        long x12 = System.currentTimeMillis();
        linkedList.stream().map(e -> {
            e.setId(e.id + 1);
            e.setName(e.name + 1);
            return e;
        }).collect(Collectors.toList());
        System.out.println("LinkedList 遍历修改单条数据："+(System.currentTimeMillis() - x12));

        // 过滤操作比较
        long x21 = System.currentTimeMillis();
        List<Df> collect1 = arrayList.stream().filter(e -> e.getId() < 200000).collect(Collectors.toList());
        System.out.println("arrayList 过滤元素：" + (System.currentTimeMillis() - x21));

        long x22 = System.currentTimeMillis();
        List<Df> dfs = linkedList.stream().filter(e -> e.getId() < 200000).collect(Collectors.toList());
        System.out.println("LinkedList 过滤元素："+(System.currentTimeMillis() - x22));

        // 查询单个比较
        long x31 = System.currentTimeMillis();
        arrayList.get(22222);
        System.out.println("arrayList 查询单个：" + (System.currentTimeMillis() - x31));

        long x32 = System.currentTimeMillis();
        linkedList.get(22222);
        System.out.println("LinkedList 查询单个元素："+(System.currentTimeMillis() - x32));

        // 删除操作比较
        long x41 = System.currentTimeMillis();
        arrayList.remove(5000);
        System.out.println(arrayList.size() + " arrayList 删除数据" + (System.currentTimeMillis() - x41));

        long x42 = System.currentTimeMillis();
        linkedList.remove(5000);
        System.out.println(linkedList.size() + "    LinkedList 删除数据："+(System.currentTimeMillis() - x42));

    }


 @Data
 @Accessors(chain = true)
 class Df{
        private int id;
        private String name;
 }


}

