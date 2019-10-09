package 自定义注解;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "ls.com",
        tags = {"sales","test" }
)
public class TestExample {

    @Test
    void testA() {
        if (true)
            throw new RuntimeException("testA 失败 ");
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("testB 成功");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }
}
