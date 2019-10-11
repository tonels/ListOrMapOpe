package regex;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;
import java.util.regex.Pattern;

public class Te {

    // todo 常用正则表达式

    @Test
    public void t1(){
        String a = "15.004";
        boolean matches = Pattern.matches("^([0-9]*|d*.d{1}?d*)$", a);
        System.out.println(matches);
    }

    @Test
    public void t2(){
        String a = "15.004";
        boolean matches = Pattern.matches("^[1-9]/d*/./d*|0/./d*[1-9]/d*$", a);
        System.out.println(matches);
    }

    @Test
    public void t3(){
        String a = "18";
        boolean matches = Pattern.matches("^\\d+(\\.\\d+)?$", a);
        System.out.println(matches);
    }

    @Test
    public void t4(){
        String a = "5'6\\";
        List<String> list = Splitter.on(Pattern.compile("['\\\\]")).splitToList(a);
        list.forEach(System.out::println);
    }

    @Test
    public void t5(){
        String a = "5'6\\";
        List<String> list = Splitter.on("\\\\|\\'").splitToList(a);
        list.forEach(System.out::println);
    }

}
