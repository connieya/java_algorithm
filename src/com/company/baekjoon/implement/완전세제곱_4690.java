package com.company.baekjoon.implement;

public class 완전세제곱_4690 {
    public static void main(String[] args) {
        for (int a=4; a<=100; a++){
            for (int i=2; i<a; i++){
                for (int j=i+1; j<a; j++){
                    for (int k=j+1; k<a; k++){
                        double aa = Math.pow(a, 3);
                        double add = Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3);
                        if (aa == add){
                            System.out.printf("Cube = %d, Triple = (%d,%d,%d)\n" , a,i,j,k);
                        }

                    }
                }
            }
        }
    }
}
