package guava.增强集合操作;

import com.google.common.base.Splitter;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import lombok.Data;
import lombok.experimental.Accessors;
import org.junit.Test;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Multiset_test {

    // todo Multiset对象不是set,是一个Collection,它本质上是一个Set加一个元素计数器。
    @Test
    public void t1(){
        Multiset multiset = HashMultiset.create();
        String sentences = "this is a story, there is a good girl in the story.";
        Iterable<String> words = Splitter.onPattern("[^a-z]{1,}").omitEmptyStrings().trimResults().split(sentences);
        for (String word : words) {
            multiset.add(word);
        }
        final Set set = multiset.elementSet();
        final Set set1 = multiset.entrySet();
        for (Object element : multiset.elementSet()) {
            System.out.println((String)element + ":" + multiset.count(element));
        }
    }

    // todo 存放POJO时，可重写POJO的equals方法，除重或者统计使用
    @Test
    public void t2(){
        Multiset multiset = HashMultiset.create();

        List<A> lists = Lists.newArrayList();
        for (int i = 0; i < 11; i++) {
            final A a = new A().setId(i).setName("test" + i);
            lists.add(a);
        }

        lists.add(new A().setId(2).setName("test2"));
        lists.add(new A().setId(2).setName("test222"));
        for (A a: lists) {
            multiset.add(a);
        }

        final Set set1 = multiset.elementSet();
        final Set set2 = multiset.entrySet();

        for (Object element : multiset.elementSet()) {
            System.out.println((A)element + ":" + multiset.count(element));
        }
    }

}

@Data
@Accessors(chain = true)
class A{
    private Integer id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(id, a.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
