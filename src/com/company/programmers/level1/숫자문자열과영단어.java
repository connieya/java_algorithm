package com.company.programmers.level1;

import java.util.Scanner;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb =  new StringBuilder();
        String s = "";
        for (char ch : str.toCharArray()){
            if (ch >=48 && ch<= 57){
                sb.append(ch);
            }else{
                s+= ch;
                if (s.equals("one")){
                    sb.append(1);
                    s = "";
                }else if (s.equals("two")){
                    sb.append(2);
                    s ="";
                }else if (s.equals("zero")){
                    sb.append(0);
                    s="";
                }else if (s.equals("three")){
                    sb.append(3);
                    s= "";
                }else if (s.equals("four")){
                    sb.append(4);
                    s= "";
                }else if (s.equals("five")){
                    sb.append(5);
                    s= "";
                }else if (s.equals("six")){
                    sb.append(6);
                    s= "";
                }else if (s.equals("seven")){
                    sb.append(7);
                    s= "";
                }else if (s.equals("eight")){
                    sb.append(8);
                    s= "";
                }else if (s.equals("nine")){
                    sb.append(9);
                    s= "";
                }
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
