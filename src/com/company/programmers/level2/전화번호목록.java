package com.company.programmers.level2;
import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) {
        String phone_book[] = {"1234", "123", "12","1","1252","2","22"};
        Arrays.sort(phone_book);
        for (String s :phone_book){
            System.out.print(s+" ");
        }
        String str = "12";
        String str2 = "123";
        System.out.println(str2.startsWith(str));
    }
}
