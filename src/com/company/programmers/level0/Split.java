package com.company.programmers.level0;

public class Split {
    public static void main(String[] args) {
        String str = "oxaaxbxxcx";
//        String str = "xabcxdefxghi";

        String[] split = str.split("x");
        for (String s : split) {
            System.out.print(s+"/");
        }
        System.out.println();
        String[] split2 = str.split("x",str.length());

        for (String s : split2) {
            System.out.print(s+"/");
        }
        System.out.println();

    }
}
