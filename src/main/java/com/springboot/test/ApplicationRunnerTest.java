package com.springboot.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunnerTest implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunnerTest.class,args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------------------------Engine Start!------------------------");
        work();
        System.out.println("------------------------ Enginr Stop!------------------------");
    }

    private void work() {
        System.out.println("---------------------------Work!-------------------------");
        System.out.println("全角转半角：");
        String lan = "\\u79fb\\u52a8\\u4e92\\u8054\\u7f51\\u5e94\\u7528";
                    //\u79fb\u52a8\u4e92\u8054\u7f51\u5e94\u7528
        System.out.println(decodeUnicode(lan));
        String zhong = gbEncoding("移动互联网应用");
        System.out.println(zhong);
        System.out.println(decodeUnicode(zhong));
    }

    /*
     * 中文转unicode编码
     */
    public static String gbEncoding(final String gbString) {
        char[] utfBytes = gbString.toCharArray();
        String unicodeBytes = "";
        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }
    /*
     * unicode编码转中文
     */
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            System.out.println(charStr);
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            System.out.println(letter);
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}
