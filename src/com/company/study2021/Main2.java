package com.company.study2021;

public class Main2 {
    static boolean checked[];
    static int answer = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        for (int i=2; i<arr.length; i++){
            for (int k=0; k<i; k++){

            }
        }
        checked = new boolean[arr.length];
        dfs(0, arr.length, arr);
        System.out.println(answer);
    }

    public static void dfs(int L, int len, int[] arr) {
        if (L == len) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                if (checked[i]) {
                    sb.append(arr[i]);
                }
            }
            System.out.println(sb);
            if (sb.toString().length() < 3) {
                return;
            }
            int index =0;
            boolean flag = true;
            for (int i = 0; i < sb.toString().length() - 1; i++) {
                if (sb.toString().charAt(i) < sb.toString().charAt(i + 1)) {
                    if (index == 2){
                        flag = false;
                        return;
                    }
                    index =1;
                } else {
                    if (index == 0){
                        flag = false;
                        return;
                    }
                   index = 2;
                }
            }
            if (flag){
                answer++;
            }
            return;
        }

        checked[L] = true;
        dfs(L + 1, len, arr);
        checked[L] = false;

    }
}
