package 枚举定义;

public class EnumDe3 {

    enum CEnum implements EnumInterface{
        /*** 未开始 */
        NOT_STARTED("0", "未开始"),
        /*** 执行中 */
        EXECUTING("1", "执行中");

         String key;
         String name;

        CEnum(String key, String name) {
            this.key = key;
            this.name = name;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getName() {
            return key;
        }
    }


}
