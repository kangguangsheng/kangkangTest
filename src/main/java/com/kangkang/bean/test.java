package com.kangkang.bean;

import java.awt.*;

public class test {
    public static void main(String[] args){
//        String s1 = "1.3.1.4.55.88";
//        String s1 = "1.3.4.55.88";
//        String s1 = "2.22.1.3.1.4.55.88";
//        String s1 = "1.3.3.1.4.55.88";
//        String s1 = "1.3.1@.*.4.55.88";
//        String s2 = "1.3.1.4";
//        System.out.println(subOID(s1,s2));


        String ss = "Adaptive Security Appliance ' GigabitEthernet0 / 3 ' interface";
        StringBuffer sb = new StringBuffer(ss);

        if(ss.contains("'")){
            int index = ss.indexOf("'");
            sb.insert(index,"\\");
            System.out.println(ss.indexOf("'",index));
            sb.insert(ss.lastIndexOf("'") + 1,"\\");
        }

//        ss.replaceAll("qq","AA");

        System.out.println(sb);
//        System.out.println(ss.contains("'"));
    }

    /*
     *   截取两个字符串的开头子字符串的其他字段
     */
    public static String subOID(String s1, String s2){
        String temp = "";
        if(s1.length() > s2.length()){
            int start = s1.indexOf(s2);
            if(start == 0)
                temp = s1.substring(s2.length(),s1.length()-1);
            else
                temp = s2 + " 不是 "  + s1 + " 的子oid";
        }else{
            int start = s2.indexOf(s1);
            if(start == 0)
                temp = s2.substring(s1.length(),s2.length()-1);
            else
                temp = s1 + " 不是 "  + s2 + " 的子oid";
        }
        return temp;
    }


}
