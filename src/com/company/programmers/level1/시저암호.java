package com.company.programmers.level1;

public class 시저암호 {
    public static void main(String[] args) {
        String s = "ZzH";
        StringBuilder sb = new StringBuilder();
        int n= 3;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                int i = (ch+n) > 90 ? (ch+n)-26 : (ch+n) ;
                sb.append((char)i);
            }else if(Character.isLowerCase(ch)){
                int j = (ch+n) >122 ? (ch+n)-26 : (ch+n);
                sb.append((char)j);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
