package 九_Base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Java8Test {

    public static void main(String args[]) {

        try {

            // Base64 编码
            String base64String = Base64.getEncoder().encodeToString(
                    "abcd".getBytes("utf-8"));
            System.out.println("Base64编码后 : " + base64String);

            // Decode
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64String);

            System.out.println("初始字符串为：" + new String(base64decodedBytes, "utf-8"));
            base64String = Base64.getUrlEncoder().encodeToString(
                    "abcd".getBytes("utf-8"));
            System.out.println("Base64编码后 : " + base64String);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; ++i) {
                UUID uuid = UUID.randomUUID();
                System.out.println("uuid : " + uuid );
                stringBuilder.append(uuid.toString());
            }
            System.out.println("拼接后的UUID为："+ stringBuilder);

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64编码后 (MIME) :" + mimeEncodedString);

        } catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }






}
