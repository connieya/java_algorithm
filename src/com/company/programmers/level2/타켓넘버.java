package com.company.programmers.level2;

public class 타켓넘버 {
    static int target = 3;
    static int numbers[] = {1, 1, 1, 1, 1};
    static int answer = 0;
    static int sum;

    public static void main(String[] args) {
        dfs(0);
        System.out.println(answer);

    }

    public static void dfs(int index) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;

        }
        sum += numbers[index];
        dfs(index + 1);

        sum -= numbers[index];
        sum +=(-1 * numbers[index]);
        dfs(index + 1);

    }
}
