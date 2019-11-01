package 枚举定义;

public class EnumDe2 {

    enum AEnum{
        /*** 未开始 */
        NOT_STARTED("0", "未开始"),
        /*** 执行中 */
        EXECUTING("1", "执行中");

        final String key;
        final String name;

        AEnum(String key, String name) {
            this.key = key;
            this.name = name;
        }

        public static EnumDe.AEnum getByKey(String key) {
            for (EnumDe.AEnum item : EnumDe.AEnum.values()) {
                if (item.getKey().equals(key)) {
                    return item;
                }
            }
            return null;
        }

        public static String getNameByKey(String key) {
            for (EnumDe.AEnum item : EnumDe.AEnum.values()) {
                if (item.getKey().equals(key)) {
                    return item.getName();
                }
            }
            return null;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * BEnum 0：失败 ；1：成功
     */
    enum BEnum {
        FAIL("0", "失败"),
        SUCCESS("1", "成功"),
        START("2", "开始");

        final String key;
        final String name;

        BEnum(String key, String name) {
            this.key = key;
            this.name = name;
        }

        public static String getNameByKey(String key) {
            for (EnumDe.BEnum item : EnumDe.BEnum.values()) {
                if (item.getKey().equals(key)) {
                    return item.getName();
                }
            }
            return null;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }
    }


}
