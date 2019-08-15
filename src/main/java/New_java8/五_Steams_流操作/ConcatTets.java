package New_java8.五_Steams_流操作;

import org.junit.Test;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ConcatTets {
    // 合并流操作
    @Test
    public void t1(){
        // Creating two Streams
        Stream<String> stream1 = Stream.of("Geeks", "for");
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");

        // concatenating both the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(stream1, stream2)
                .forEach(element -> System.out.println(element));
    }

    @Test
    public void t2(){
        // Creating more than two Streams
        Stream<String> stream1 = Stream.of("Geeks");
        Stream<String> stream2 = Stream.of("GeeksQuiz");
        Stream<String> stream3 = Stream.of("GeeksforGeeks");
        Stream<String> stream4 = Stream.of("GFG");

        // concatenating all the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(Stream.concat(Stream.concat(stream1,
                stream2), stream3), stream4)
                .forEach(element -> System.out.println(element));
    }

    @Test
    public void t3(){
        // Creating two Streams
        DoubleStream Stream1 = DoubleStream.of(1520, 1620);
        DoubleStream Stream2 = DoubleStream.of(1720, 1820);

        // concatenating both the Streams and
        // displaying the result
        DoubleStream.concat(Stream1, Stream2)
                .forEach(element -> System.out.println(element));
    }

    @Test
    public void t4(){
        // Creating two Streams
        Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks");
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for");

        // concatenating both the Streams
        // with Stream.concat() function
        // and displaying the result after
        // removing the duplicates
        Stream.concat(stream1, stream2).distinct().forEach(element -> System.out.println(element));
    }

    @Test
    public void t5(){
        // Creating two Streams
        LongStream Stream1 = LongStream.of(1520, 1620);
        LongStream Stream2 = LongStream.of(1720, 1820);

        // concatenating both the Streams and
        // displaying the result
        LongStream.concat(Stream1, Stream2)
                .forEach(element -> System.out.println(element));
    }



 }
