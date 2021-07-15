package com.company.programmers.level1;

import java.util.Scanner;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<phone.length(); i++){
            if (i< phone.length()-4){
                sb.append("*");
            }else {
                sb.append(phone.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
