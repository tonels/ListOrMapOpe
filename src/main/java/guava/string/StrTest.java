package guava.string;

import com.google.common.primitives.Bytes;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import org.junit.Test;

public class StrTest {

    // String to num
    @Test
    public void t1(){

        //  Long 最多可转 19 位的(-9223372036854775807,9223372036854775807],其他为Null
        System.out.println("Longs.MAX_POWER_OF_TWO : "+ Longs.MAX_POWER_OF_TWO);
        System.out.println("Longs.BYTES : "+ Longs.BYTES);


        // Integer 最多可转 10 位数的(-2147483648,2147483647],21亿那么大，多了为null
        System.out.println("Ints.MAX_POWER_OF_TWO : " + Ints.MAX_POWER_OF_TWO);
        System.out.println("Ints.BYTES : " + Ints.BYTES);

        // short 类型的数据
        System.out.println("Shorts.MAX_POWER_OF_TWO : "+Shorts.MAX_POWER_OF_TWO);
        System.out.println("Shorts.BYTES : "+Shorts.BYTES);

    }


    @Test
    public void t2(){

    }


}
