package guava.table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Map;

// todo 这是一个二维表的数据结构，一个二维矩阵
public class Table_ {
    @Test
    public void t1(){

       Table<String, String, String> studentTable = HashBasedTable.create();
        studentTable.put("CSE", "5", "Dhiman");
        studentTable.put("CSE", "7", "Shubham");
        studentTable.put("CSE", "9", "Abhishek");
        studentTable.put("CSE", "12", "Sahil");

        studentTable.put("ECE", "15", "Ram");
        studentTable.put("ECE", "18", "Anmol");
        studentTable.put("ECE", "20", "Akhil");
        studentTable.put("ECE", "25", "Amrit");

        Map<String, String> eceMap = studentTable.row("ECE");
        System.out.println("List of ECE students : ");

        for (Map.Entry<String, String> student : eceMap.entrySet()) {
            System.out.println("Student Roll No : " + student.getKey() + ", Student Name : " + student.getValue());
        }

        System.out.println();

        Map<String, String> stuMap = studentTable.column("12");
        for (Map.Entry<String, String> student : stuMap.entrySet()) {
            System.out.println("Student Roll No : " + student.getKey() + ", Student Name : " + student.getValue());
        }
    }

}
