package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {

        final Tes1 obj = new Tes1();
        Class cls = obj.getClass();

        System.out.println("The name of class is : " + cls.getName());
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " + constructor.getName());

        System.out.println("The public methods of class are : ");

        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
        methodcall1.invoke(obj,11);






    }


}

class Tes1 {
    private String s;

    public Tes1() {
        s = "reflect test..";
    }

    public void method1(){
        System.out.println("The String is : " + s);
    }

    public void method2(int n){
        System.out.println("The number is ： " + n);
    }

    public void method3(){
        System.out.println("Private mathod invoked");
    }

}

