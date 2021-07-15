package com.company.programmers.level1;

public class 수박수박수박수 {
    public static void main(String[] args) {
        int n= 1000;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
          sb.append(i%2==0?"수":"박");
        }
        System.out.println(sb);
    }
}
