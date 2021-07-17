package com.company.programmers.level1;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        int answer =0;
        for (int i=left; i<=right; i++){
           if (divisor(i)%2==0){
               answer +=i;
           }else{
               answer-=i;
           }
        }
        System.out.println(answer);
    }
    static int divisor(int n){
        int count =0;
        for (int i=1; i<=n/2; i++){
            if (n%i==0) count++;
        }
        return count+1;
    }
}
