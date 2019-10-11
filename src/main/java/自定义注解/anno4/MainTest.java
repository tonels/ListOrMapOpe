package 自定义注解.anno4;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

public class MainTest {

    @Test
    public void t1() throws Exception {
        User user = new User();
        user.setEmail("aa@as.com");
        user.setName("hplr");
        user.setId(112L);
        user.setCreated(new Date());

        for (Field field : user.getClass().getDeclaredFields()) {
            DBField dbField = field.getAnnotation(DBField.class);
            System.out.println("field name: " + dbField.name());

            /** changed the access to public */
            field.setAccessible(true);
            Object value = field.get(user);
            System.out.println("field value: " + value);

            System.out.println("field type: " + dbField.type());
            System.out.println("is primary: " + dbField.isPrimaryKey());
            System.out.println();
        }

    }


}
