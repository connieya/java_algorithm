package com.company.inflearn.sec02_array;

import java.util.Scanner;
public class 가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        for (int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            String answer ="";
            if (A[i]==B[i]){
               sb.append("D"+"\n");
            }else if (A[i]==1 && B[i]==3 || A[i]==3 && B[i]==1){
               answer=  (A[i]>B[i]) ? "B" :"A";
                sb.append(answer+"\n");
            }else {
                answer = (A[i]>B[i]) ? "A" : "B";
                sb.append(answer+"\n");
            }
        }
        System.out.println(sb);
    }
}
