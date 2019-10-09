package New_java8.五_Steams_流操作;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Test2 {

    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    @Test
    public void t1(){
        System.out.println("********************************** Using Java 7: **********************************");

        // Count empty strings

        System.out.println("List: " +strings);
        long count = getCountEmptyStringUsingJava7(strings);

        System.out.println("Empty Strings: " + count);
        count = getCountLength3UsingJava7(strings);

        System.out.println("Strings of length 3: " + count);

        //Eliminate empty string
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("Filtered List: " + filtered);

        //Eliminate empty string and join using comma.
        String mergedString = getMergedStringUsingJava7(strings,", ");
        System.out.println("Merged String: " + mergedString);


        //get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("Squares List: " + squaresList);
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        System.out.println("List: " +integers);
        System.out.println("Highest number in List : " + getMax(integers));
        System.out.println("Lowest number in List : " + getMin(integers));
        System.out.println("Sum of all numbers : " + getSum(integers));
        System.out.println("Average of all numbers : " + getAverage(integers));
        System.out.println("Random Numbers: ");

        //print ten random numbers
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

    }

    @Test
    public void t2(){

        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

    }

    @Test
    public void t3(){

        ArrayList<String> strings = Lists.newArrayList("ai", "aq", "ae", "er", "", "  ", "ffs", null);
        List<String> filtered = strings.stream().filter(e -> !StrUtil.isBlankIfStr(e)).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered.toString());

        String collect = strings.stream().filter(e -> !StrUtil.isBlankIfStr(e)).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + collect);

        List<Integer> collect1 = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + collect1);

    }

    @Test
    public void t4(){
        // 基本统计
        // IntSummaryStatistics{count=7, sum=25, min=2, average=3.571429, max=7}
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println(stats);


        //parallel processing
        ArrayList<String> strings = Lists.newArrayList("ai", "aq", "ae", "er", "", "  ", "ffs", null);
        long count = strings.parallelStream().filter(e -> !StrUtil.isBlankIfStr(e)).count();
        System.out.println("非空字符串个数为 ：" + count);
    }





    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for(String string: strings) {

            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;

        for(String string: strings) {

            if(string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();

        for(String string: strings) {

            if(!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private static String getMergedStringUsingJava7(List<String> strings, String separator) {
        StringBuilder stringBuilder = new StringBuilder();

        for(String string: strings) {

            if(!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length()-2);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<Integer>();

        for(Integer number: numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());

            if(!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for(int i = 1;i < numbers.size();i++) {

            Integer number = numbers.get(i);

            if(number.intValue() > max) {
                max = number.intValue();
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);

        for(int i= 1;i < numbers.size();i++) {
            Integer number = numbers.get(i);

            if(number.intValue() < min) {
                min = number.intValue();
            }
        }
        return min;
    }

    private static int getSum(List numbers) {
        int sum = (int)(numbers.get(0));

        for(int i = 1;i < numbers.size();i++) {
            sum += (int)numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }


}
