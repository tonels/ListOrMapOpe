package guava.object;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import lombok.Data;
import org.junit.Test;

@Data
class St1 {
    private String name;
    private Integer age;
    private String city;
}

@Data
class St2 {
    private String name;
    private Integer age;
    private String city;

    @Override
    public String toString() {
        return "St2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

@Data
class St3 {
    private String name;
    private Integer age;
    private String city;

    // todo guava，重写对象的toString方法，为空时忽略
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this.getClass())
                .add("city", city)
                .add("name", name)
                .add("age", age)
                .omitNullValues().toString();
    }
}

public class TestObjetcs {
    @Test
    public void t1() {
        System.out.println("st1 = " + new St1());
        System.out.println("st2 = " + new St2());

        final St3 st3 = new St3();
        st3.setAge(12);
        System.out.println("st3 = " + st3);
    }

    @Test
    public void t2() {
        final St3 st3 = new St3();
        st3.setName("zhp");
        st3.setCity("bj");
        st3.setAge(19);
        f1(st3);
    }

    // todo guava 参数校验
    public void f1(St3 st3) {
        Preconditions.checkNotNull(st3.getName(), "name may not be null");
        Preconditions.checkArgument(st3.getAge() >= 18 && st3.getAge() < 99, "age must in range (18,99)");
        Preconditions.checkArgument(st3.getCity() != null && st3.getCity().length() < 10, "desc too long, max length is ", 10);

    }

}
