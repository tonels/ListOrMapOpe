package 自定义注解.anno2;

import org.junit.Test;

@Custom1(values = {"V1","V2"})
public class MainTest {

    @Test
    public void t1(){

        MainTest t = new MainTest();

        boolean present = t.getClass().isAnnotationPresent(Custom1.class);

        if (present) {

            Custom1 ca = t.getClass().getAnnotation(Custom1.class);
            if (ca != null) {
                for (String value : ca.values()){
                    System.out.println(value);
                }
            }
        }

    }

}
