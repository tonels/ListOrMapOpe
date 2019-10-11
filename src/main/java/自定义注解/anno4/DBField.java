package 自定义注解.anno4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// todo 字段级别的注解

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBField {

    String name();

    Class< ? > type();

    boolean isPrimaryKey() default false;
}
