package guava.table;

import com.google.common.collect.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class Tab2 {

// ===================== 初始化 create =============================

    @Test
    public void t1(){
        // 基于 LinkedHashMap
        Table<String, String, Integer> basedTable = HashBasedTable.create();

        // 基于 TreeMap
        Table<String, String, Integer> treeTable = TreeBasedTable.create();

        // 已知 universityRowTable 和 courseColumnTables
        List<String> universityRowTable = Lists.newArrayList("Mumbai", "Harvard");
        List<String> courseColumnTables = Lists.newArrayList("Chemical", "IT", "Electrical");
        Table<String, String, Integer> universityCourseSeatTable = ArrayTable.create(universityRowTable, courseColumnTables);

        //
        Table<String, String, Integer> universityCourseSeatTable2
                = ImmutableTable.<String, String, Integer> builder()
                .put("Mumbai", "Chemical", 120).build();

    }

    @Test
    public void givenTable_whenGet_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable
                = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        int seatCount = universityCourseSeatTable.get("Mumbai", "IT"); // 60
        Integer seatCountForNoEntry = universityCourseSeatTable.get("Oxford", "IT"); // null

    }

    @Test
    public void givenTable_whenContains_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        boolean entryIsPresent = universityCourseSeatTable.contains("Mumbai", "IT");  // true
        boolean courseIsPresent = universityCourseSeatTable.containsColumn("IT"); // true
        boolean universityIsPresent = universityCourseSeatTable.containsRow("Mumbai"); // true
        boolean seatCountIsPresent = universityCourseSeatTable.containsValue(60); // true
    }

}
