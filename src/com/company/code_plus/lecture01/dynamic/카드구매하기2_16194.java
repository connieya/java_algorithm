package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class 카드구매하기2_16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp[] = new int[n + 1];
        int mp[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            cp[i] =sc.nextInt();
            mp[i] = cp[i];
        }

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (mp[i] > mp[i-j]+cp[j]){
                    mp[i] = mp[i-j]+cp[j];
                }
            }
        }
        System.out.println(mp[n]);
    }
}
