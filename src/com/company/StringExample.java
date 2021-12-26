package com.company;

public class StringExample {
    public static void main(String[] arr){
        String strA1 = "aaaaaa";
        String strA2_ = "aaa";
        String strA2 = "aaa";
        String strB1 = "b";

        strA2 = strA2_ + "aaa";

        System.out.println(strA2_ + "aaa");
        System.out.println(strA2_);

        if (strA1 == strA2) {
            System.out.println("strA1 == strA2 " + strA1 + " == " + strA2);
        } else {
            System.out.println("strA1 != strA2 " + strA1 + " != " + strA2);
        }
    }
}
