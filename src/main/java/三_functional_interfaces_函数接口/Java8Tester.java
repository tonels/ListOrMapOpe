package 三_functional_interfaces_函数接口;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.print("print all number：");

        System.out.print("请打印 n 大于 3 的数：");
        eval(list,n -> n > 3);
        System.out.print("打印偶数。。。");
        eval(list,n -> n%2 == 0);
        }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
    }
}
