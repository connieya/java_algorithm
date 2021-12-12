package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전게임_2684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String coin[] = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
        int arr[];
        while (n-- > 0) {
            arr = new int[8];
            String str = br.readLine();
            for (int i=0; i<38; i++){
                StringBuilder sb = new StringBuilder();
                for (int j=i; j<i+3; j++){
                    sb.append(str.charAt(j));
                }
                for (int k=0; k<8; k++){
                    if(coin[k].equals(sb.toString())){
                        arr[k]++;
                        break;
                    }
                }
            }
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
