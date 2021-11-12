package com.company.programmers.level2;

public class 소수찾기 {
    static boolean viisted[], prime[];
    static char ch[];
    static int count;

    public static void main(String[] args) {
        String numbers = "17";
        char number[] = new char[numbers.length()];
        viisted = new boolean[number.length];
        ch = new char[number.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = numbers.charAt(i);
        }
        prime = new boolean[10_000_000];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        dfs(0, number);
        System.out.println(count);
    }

    public static void dfs(int depth, char number[]) {
        if (depth == number.length) {
            String str = "";
            for (char ch : number) {
                str += ch;
            }
            System.out.println(str);
            if (!prime[Integer.parseInt(str)]) {
                count++;
            }
            return;
        }
        for (int i = 0; i < number.length; i++) {
            if (!viisted[i]) {
                viisted[i] = true;
                ch[depth] = number[i];
                dfs(depth+1,number);
                viisted[i] = false;
            }
        }
    }
}
