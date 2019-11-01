package 枚举定义;

import org.junit.Test;

public class EnumTest {

    // EnumDe
    @Test
    public void t1(){
        System.out.println(EnumDe.AEnum.EXECUTING.key);
        System.out.println(EnumDe.AEnum.EXECUTING.getKey());
        System.out.println(EnumDe.AEnum.getNameByKey("0"));
        System.out.println(EnumDe.AEnum.getByKey("0"));
    }

    // EnumDe2
    @Test
    public void t2(){
        System.out.println(EnumDe2.AEnum.EXECUTING.key);
        System.out.println(EnumDe2.AEnum.EXECUTING.getKey());
        System.out.println(EnumDe2.AEnum.getNameByKey("0"));
        System.out.println(EnumDe2.AEnum.getByKey("0"));
    }

    // EnumDe3
    @Test
    public void t3(){
        System.out.println(EnumDe3.CEnum.EXECUTING.key);
        System.out.println(EnumDe3.CEnum.EXECUTING.getKey());

    }








}
