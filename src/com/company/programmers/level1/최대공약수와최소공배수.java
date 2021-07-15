package com.company.programmers.level1;

public class 최대공약수와최소공배수 {

    static int GCD(int a , int b){
        if (b==0) return a;

        return GCD(b,a%b);
    }
    public static void main(String[] args) {
       int n = 2;
       int m = 5;

       int a= n;
       int b =m;
       while (m!=0){
           int r = n%m;
           n = m;
           m = r;
       }
        System.out.println(n);
        System.out.println( (a*b) / n);
    }
}
