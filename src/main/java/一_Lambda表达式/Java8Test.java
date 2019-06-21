package 一_Lambda表达式;

import java.util.List;

public class Java8Test {

    public static void main(String args[]) {
        Java8Test tester = new Java8Test();

        //with type declaration,声明变量
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

/*
以下是lambda表达式的重要特征。

可选类型声明 - 无需声明参数的类型。编译器可以从参数的值推断出相同的值。

参数的可选括号 - 无需在括号中声明单个参数。对于多个参数，需要括号。

可选花括号 - 如果主体包含单个语句，则无需在表达式主体中使用花括号。

可选的return关键字 - 如果正文具有单个表达式以返回值，则编译器会自动返回该值。需要使用大括号来表示表达式返回一个值。

 */