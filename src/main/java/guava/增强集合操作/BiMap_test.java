package guava.增强集合操作;

import com.google.common.collect.HashBiMap;
import org.junit.Test;

public class BiMap_test {

    @Test
    public void t1(){
        final HashBiMap<String, String> biMap = HashBiMap.create();

        biMap.put("星期一","Monday");
        biMap.put("星期二","Tuesday");
        biMap.put("星期三","Wednesday");
        biMap.put("星期四","Thursday");
        biMap.put("星期五","Friday");
        biMap.put("星期六","Saturday");
        biMap.put("星期日","Sunday");

        System.out.println("星期日的英文名是" + biMap.get("星期日"));
        System.out.println("Sunday的中文是" + biMap.inverse().get("Sunday"));
    }



}
