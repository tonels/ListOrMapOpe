package guava.string;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StrTest {

    private static List<String> strs;

    static {
        strs = Lists.newArrayList(
                "Geeks",
                "for",
                "GeeksClasses",
                "GeeksforGeeks",
                "DataStructures","",null);
    }

    // todo String to num
    @Test
    public void t1(){

        //  Long 最多可转 19 位的(-9223372036854775807,9223372036854775807],其他为Null
        System.out.println("Longs.MAX_POWER_OF_TWO : "+ Longs.MAX_POWER_OF_TWO);
        System.out.println("Longs.BYTES : "+ Longs.BYTES);


        // Integer 最多可转 10 位数的(-2147483648,2147483647],21亿那么大，多了为null
        System.out.println("Ints.MAX_POWER_OF_TWO : " + Ints.MAX_POWER_OF_TWO);
        System.out.println("Ints.BYTES : " + Ints.BYTES);

        // short 类型的数据
        System.out.println("Shorts.MAX_POWER_OF_TWO : "+Shorts.MAX_POWER_OF_TWO);
        System.out.println("Shorts.BYTES : "+Shorts.BYTES);

    }


    // todo 对空的不同定义
    @Test
    public void t2(){
        // 过滤集合中为null,或者为 " "的
        strs.add("  ");
        System.out.println(strs.size());

        final List<String> c1 = strs.stream().filter(e -> !Strings.isNullOrEmpty(e)).collect(Collectors.toList());
        System.out.println("Guava Strings.isNullOrempty : " + c1.size());

        final List<String> c2 = strs.stream().filter(e -> !StrUtil.isBlankIfStr(e)).collect(Collectors.toList());
        System.out.println("Hutool StrUtil.isBlankIfStr : " + c2.size());

        final List<String> c3 = strs.stream().filter(e -> !StrUtil.isEmptyIfStr(e)).collect(Collectors.toList());
        System.out.println("Hutool StrUtil.isEmptyIfStr : " + c3.size());

//        Guava Strings.isNullOrempty : 6
//        Hutool StrUtil.isBlankIfStr : 5
//        Hutool StrUtil.isEmptyIfStr : 6
    }

    // todo 转大小写，驼峰，下划线命名
    @Test
    public void t3(){
        strs.add("oms_content");
        strs.add("omsContent");
        strs.stream().filter(e ->!StrUtil.isBlankIfStr(e)).map(e ->e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=================");
        strs.stream().filter(e ->!StrUtil.isBlankIfStr(e)).map(e ->StrUtil.toCamelCase(e)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=================");
        strs.stream().filter(e ->!StrUtil.isBlankIfStr(e)).map(e ->StrUtil.toUnderlineCase(e)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=================");

//        strs.stream().filter(e ->!StrUtil.isBlankIfStr(e)).map(e -> CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_CAMEL,e)).collect(Collectors.toList()).forEach(System.out::println);
        strs.stream().filter(e ->!StrUtil.isBlankIfStr(e)).map(e -> CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_CAMEL,e)).collect(Collectors.toList()).forEach(System.out::println);


    }


}
