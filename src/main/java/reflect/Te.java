package reflect;

import org.junit.Test;

public class Te {
    @Test
    public void t1(){
        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer();
        TestMo testMo = new TestMo();
        String s = objectAnalyzer.toString(testMo);
        System.out.println(s);
    }

}
