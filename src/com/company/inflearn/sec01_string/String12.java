package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String12 {

    public String solution(String s, int i){


        String answer = "";

        if (i*7 != s.length()){
            return  "7자리씩 입력하세요";
        }
        char[] cha = s.toCharArray();
        for (int j=0; j<s.length(); j++){
            if (s.charAt(j) == '#'){
                cha[j] = '1';

            }else {
                cha[j] = '0';
            }
        }

        String st = String.valueOf(cha);
        int result = 0;
        int data[] = new int[i];
        for (int z=0; z< i; z++){
            String sub = st.substring(z * 7, (z + 1) * 7);
            for (int k =0; k<sub.length(); k++){
                if (sub.charAt(k) == '1'){
                   result += Math.pow(2,sub.length()-1-k);
                }else {
                    result += 0;
                }
            }
            data[z] = result;
            result = 0;


        }
        for (int x : data){
           answer += (char) x;
        }


        return answer;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        String12 S = new String12();

        System.out.println(S.solution(str,num));

    }


}
