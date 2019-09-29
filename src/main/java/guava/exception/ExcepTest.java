package guava.exception;

import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import org.hibernate.service.spi.ServiceException;
import org.junit.Test;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class ExcepTest {

    // todo Guava异常处理样例
//    @Test
//    public void t3() throws IOException,SQLException{
//        Lists.newArrayList(RandomUtil.randomLong(20))
//        try {
//             // todo 可控的异常处理
//            someMethodThatCouldThrowAnything();
//        } catch (IKnowWhatToDoWithThisException e) {
//            handle(e);
//        } catch (Throwable t) {
////            Throwables.throwIfInstanceOf(t, IOException.class);
////            Throwables.throwIfInstanceOf(t, SQLException.class);
////            throw new RuntimeException(t);  // throw t;{}
//        }
//    }

    @Test
    public void t1() {
            int a = 2019;
            int b = 0;
        try {
            final int i = a / b;
        }catch (ArithmeticException e){
            throw new ServiceException("分母不能是0啊");
        }
        catch (Throwable t) {
            final String s = Throwables.getStackTraceAsString(t);
            if (s.contains("by zero")) {
                throw new ServiceException("分母不能是0");
            }
        }
    }

    // todo IO流异常处理
    @Test
    public void  test2() {
        // 输入和输出都使用缓冲流
        try {
            FileInputStream in = new FileInputStream("D:\\temp\\a.txt");
            BufferedInputStream inBuffer = new BufferedInputStream(in);
            FileOutputStream out = new FileOutputStream("D:\\temp\\a_copy.txt");
            BufferedOutputStream outBuffer = new BufferedOutputStream(out);
            int len = 0;
            byte[] bs = new byte[1024];
            long begin = System.currentTimeMillis();
            while ((len = inBuffer.read(bs)) != -1) {
                outBuffer.write(bs, 0, len);
            }
            System.out.println("复制文件所需的时间：" + (System.currentTimeMillis() - begin)); // 平均时间约 200 多毫秒
            inBuffer.close();
            in.close();
            outBuffer.close();
            out.close();
        } catch (FileNotFoundException f) {
            throw new ServiceException("文件未找到!");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Test
    public void t4() {
        final ArrayList<Integer> list = Lists.newArrayList(1, 2, 3, 3, 3, 5, 46, 4, 7, 8, 7);
        Integer integer = null;
        try {
            integer = list.get(2);
            final int i = integer / 0;
        } catch (Throwable e) {
            Throwables.throwIfInstanceOf(e,NullPointerException.class);
            Throwables.throwIfInstanceOf(e,IndexOutOfBoundsException.class);
        }
        System.out.println(integer);
    }

    @Test
    public void t5(){
        String a = "2019-06-16 12:16:49";
        LocalDateTime time = null;
        try {
            time = LocalDateTime.parse(a);
        } catch (DateTimeParseException e){
            throw new ServiceException("时间转换异常");
        }catch (Throwable t) {
            Throwables.throwIfInstanceOf(t, DateTimeParseException.class);
        }
        System.out.println(time);
    }




}
