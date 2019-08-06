package New_java8.五_Steams_流操作;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("随机打印10个数字..");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::print);

        System.out.println("******************************************");
        System.out.println("steam 生成流。。");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("初始数组为 ：" + strings);
        System.out.println("过滤后的数组为 ：" + filtered);

        System.out.println("******************************************");
        System.out.println("Map 操作，将每个元素映射到其对应的结果");
        List<Integer> number = Arrays.asList(3, 2, 3, 6, 8, 9, 7, 5, 1);
        List<Integer> list1 = number.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("*******************************");
        System.out.println("filter 操作，过滤条件");
        List<String> list = Arrays.asList("a", "s", "", "f", "g", "", "h", "a", "", "s");
        long count = list.stream()
                .filter(a -> a.isEmpty())
                .count();
        System.out.println("为空的值有.."+ count+"个");

        System.out.println("******************************************");
        System.out.println("limit 操作");
        Random random1 = new Random();
        random1.ints()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Limit 操作后" + random1.toString());

        System.out.println("******************************************");
        System.out.println("Parallel Processing 并行处理");
        List<String> list2 = Arrays.asList("asd", "saf", "", "fd", "hfg", "kjhl", "vb", "ret","asd", "saf", "", "fd", "hfg", "kjhl", "vb", "ret","asd", "saf", "", "fd", "hfg", "kjhl", "vb", "ret","asd", "saf", "", "fd", "hfg", "kjhl", "", "");

        long count1 = list2.parallelStream()
                .filter(a -> a.isEmpty())
                .count();
        System.out.println("为空的值为 ：" + count1);

        System.out.println("******************************************");
        System.out.println("Collectors 操作");
        List<String> list3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> collect = list3.stream()
                .filter(a -> !a.isEmpty())
                .collect(Collectors.toList());
        System.out.println("处理后的collect 为 : " + collect);

        String collect1 = list3.stream()
                .filter(a -> !a.isEmpty())
                .collect(Collectors.joining(","));

        String collect2 = list3.stream()
                .filter(a -> !a.isEmpty())
                .collect(Collectors.joining(collect1));

        Map<Integer, List<String>> collect3 = list3.stream()
                .filter(a -> !a.isEmpty())
                .collect(Collectors.groupingBy(o -> o.hashCode()));

        System.out.println("collect1 为 : " + collect1);
        System.out.println("collect1 + collect2 为 : " + collect2);
        System.out.println("collect3 Map 为 : " + collect3);


        System.out.println("******************************************");
        System.out.println("Statistics 统计操作");

        List  numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 7, 8, 7, 5);
        IntSummaryStatistics stat = numbers.stream()
                .mapToInt((x)-> (int) x).summaryStatistics();

        System.out.println("最大的数：MAX = " + stat.getMax());
        System.out.println("最小的数为 MIN = " + stat.getMin());
        System.out.println("总和为 SUM = " + stat.getSum());
        System.out.println("平均数为 AVG =  ： " + stat.getAverage());

    }







}
