package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] input2 = input.split(" ");

        String max = input2[0];
//        for (int i = 0; i< input2.length; i++){
//           if (input2[i].length() > max.length()){
//               max  = input2[i];
//           }
//        }

        int m = Integer.MIN_VALUE;
        for (int i =0; i< input2.length; i++){
            int length = input2[i].length();
            if (length > m){
                m = length;
                max = input2[i];
            }

        }
        System.out.println(max);


    }
}
