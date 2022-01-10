package com.company.programmers.level2;

import java.util.PriorityQueue;

public class 단체사진찍기  {
    public static void main(String[] args) {
        int n = 2;
        String data[] = {"N~F=0","R~T>2"};
        String str = "ACFJMNRT";
        int count = 0;
        char ans[] = str.toCharArray();
        do {
            boolean flag = true;
            for (String s : data){
                if (!isRight(String.valueOf(ans),s)){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }while (next_permutation(ans));
        System.out.println(count);
    }
    public static boolean isRight(String str , String s){
        char first = s.charAt(0);
        char second = s.charAt(2);
        char op = s.charAt(3);
        int num = s.charAt(4)-'0';
        int distance = Math.abs(str.indexOf(first) - str.indexOf(second)) -1;
        if (op == '=' && distance == num){
            return true;
        }else if (op == '>' && distance > num) {
            return true;
        }else if (op == '<' && distance < num) {
            return true;
        }
        return false;

    }

    public static boolean next_permutation(char ans[]) {
        int i = ans.length - 1;
        while (i > 0 && ans[i - 1] > ans[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = ans.length -1;
        while (ans[i-1] > ans[j]) {
            j--;
        }
        char tmp = ans[j];
        ans[j] = ans[i-1];
        ans[i-1] = tmp;
        j = ans.length-1;
        while (i < j){
            tmp = ans[j];
            ans[j] = ans[i];
            ans[i] = tmp;
            i++;
            j--;
        }
        return true;
    }
}
