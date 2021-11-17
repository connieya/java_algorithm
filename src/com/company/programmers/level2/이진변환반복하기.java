package com.company.programmers.level2;

public class 이진변환반복하기 {

    public static void main(String[] args) {
        String s = "110010101001";
        int zero = 0;
        int count =0;
        while (!s.equals("1")){
            for (char ch : s.toCharArray()) {
                if (ch == '0'){
                    zero++;
                }
            }
            s = s.replaceAll("0","");
            int len = s.length();
            StringBuilder sb = new StringBuilder();
            s = toBinary(len,sb);
            count++;

        }
        Integer.toBinaryString(1);
        System.out.println(count);
        System.out.println(zero);

    }
    public static String toBinary(int s, StringBuilder sb){
        if (s==0) return sb.toString();
        toBinary(s/2 ,sb);
        sb.append(s%2);

        return sb.toString();

    }
}
