package 六_Optional_可选类;

import java.util.Optional;

/**
 * Optional是用于包含非null对象的容器对象。可选对象用于表示缺少值的null。此类具有各种实用程序方法，以便于代码将值处理为“可用”或“不可用”，而不是检查空值。它在Java 8中引入，类似于Guava中的Optional。
 */

public class Java8Test {

    public static void main(String args[]) {
        Java8Test java8Teste = new Java8Test();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);

        System.out.println(java8Teste.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();

        return value1 + value2;
    }

}
