package chapter2;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Base64;

public class MainBASE64 {
    public static void main(String[] args) throws IOException {
        BASE64Encoder encoder1 = new BASE64Encoder();
        BASE64Decoder decoder1 = new BASE64Decoder();
        String text = "测试字符串";
        String charset = "UTF-8";
        // 编码
        String encodeStr = encoder1.encode(text.getBytes(charset));
        System.out.println("原始字符串：" + text);
        System.out.println("BASE64Encoder加密后：" + encodeStr);
        // 解码
        String decodeStr = new String(decoder1.decodeBuffer(encodeStr), charset);
        System.out.println("BASE64Decoder解密后：" + decodeStr);

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        Base64.Encoder encoder2 = Base64.getEncoder();
        Base64.Decoder decoder2 = Base64.getDecoder();
        // 编码
        byte[] encodeByte = encoder2.encode(text.getBytes(charset));
        String encodeStr2 = new String(encodeByte, charset);
        System.out.println("原始字符串：" + text);
        System.out.println("Base64.Encoder加密后：" + encodeStr2);
        // 解码
        String decodeStr2 = new String(decoder2.decode(encodeStr2), charset);
        System.out.println("Base64.Decoder解密后：" + decodeStr2);


    }
}
