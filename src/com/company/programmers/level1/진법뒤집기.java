package com.company.programmers.level1;

public class 진법뒤집기 {
    public static void main(String[] args) {
        int n = 125;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        //1번째 방법
        String str = sb.toString();
        int count = 0;
        int sum = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(str.charAt(i));
            sum += Math.pow(3, count++) * num;
        }
        System.out.println(sum);

        // 2번 째 방법
        System.out.println(Integer.parseInt(sb.toString(), 3));

        // 3번째 방법
        count = 0;
        sum = 0;
        for (int i = str.length()-1; i >= 0; i--) {
           sum += Math.pow(3,count++) * Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }
}
