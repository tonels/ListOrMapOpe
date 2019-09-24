package guava.split;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;

public class Split_toList {

    /**
     * 将string 按照 ','切割成List数组
     */
    @Test
    public void t1(){
        String str = "Hello, geeks, for, geeks, noida";
        List<String> myList = Splitter.on(',').splitToList(str);
        for (String temp : myList) {
            System.out.println(temp);
        }
    }

    /**
     * 不可以连续切，只匹配后面的 on()
     */
    @Test
    public void t2(){
        String str = "Everyone. should. Learn, Data. Structures";
        List<String> myList = Splitter.on('.').on(',').splitToList(str);
        for (String temp : myList) {
            System.out.println(temp);
        }
    }

    /**
     * 对分割符前后的空格或者为空时的处理
     */
    @Test
    public void t3(){
        String str = "  , Everyon  ,  , should,  Learn, Data, Structures";
        List<String> guaList = Splitter.on(',').trimResults().omitEmptyStrings().splitToList(str);
        for (String temp : guaList) {
            System.out.println(temp);
        }
    }


}
