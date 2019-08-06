package New_java8.二_method_references_方法参考;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {

    public static void main(String[] args) {
        List names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
