package guava.optional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.google.common.base.Strings.emptyToNull;

public class Optional_ {
    @Test
    public void t1(){
        // 初始化 List
        List<String> myList = new ArrayList<>();
        myList.add("Geeks");
        myList.add("for");
        myList.add("GeeksClasses");
        myList.add(null);
        myList.add("GeeksforGeeks");
        myList.add("");
        myList.add("Data Structures");

        displayValuesUsingJavaNulls(myList); // 基础手写方法判断是否为空代码
        displayValuesUsingGuavaOptional(myList); // 调用 guava Optional封装方法实现
    }

    // Method to display values using Java Nulls
    private static void displayValuesUsingJavaNulls(List<String> myList) {
        System.out.println("Displaying values using Java Nulls");
        // For every String in myList
        for (String str : myList) {
            if (str == null || str.isEmpty()) {
                System.out.println("String : Value is empty or not available");
            }
            else {
                System.out.println("String : " + str);
            }
        }
        System.out.println();
    }

    // Method to display values using Guava Optional
    private static void displayValuesUsingGuavaOptional(List<String> myList) {
        System.out.println("Displaying values using Guava Optional");

        for (String str : myList) {
            Optional<String> optionalName = Optional.ofNullable(emptyToNull(str));
            System.out.println("String : " + optionalName.orElse("String : Value is empty or not available"));
        }
    }
}
