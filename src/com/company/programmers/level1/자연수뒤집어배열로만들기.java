package com.company.programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 1234213131315L;
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;
        while(n>0) {
            answer[cnt]=(int)n%10;
            n/=10;
            cnt++;
        }
        for (int x: answer){
            System.out.print(x);
        }
    }
}
