package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array03_answer {
    public String  solution(int n, int[]a ,int[]b){
        String answer="";
        for (int i=0; i<n; i++){
            if (a[i] == b[i]) answer +="D";
            else if(a[i]==1 && b[i]==3) answer +="A";
            else if(a[i]==2 && b[i]==1) answer+= "A";
            else if(a[i]==3 && b[i]==2) answer +="A";
            else answer +="B";

        }
        return answer;
    }

    public static void main(String[] args) {
        Array03_answer A = new Array03_answer();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for (char c : A.solution(n,a,b).toCharArray()){
            System.out.println(c);
        }
    }
}
