package 自定义注解.anno3;

import org.junit.Test;

import java.lang.reflect.Method;

public class MainTest {

    @Test
    public void t1(){

        AnnotationRunner runner = new AnnotationRunner();
        Method[] methods = runner.getClass().getMethods();

        for (Method method : methods) {
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
