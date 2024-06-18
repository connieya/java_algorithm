package com.company.programmers.level2;

public class 이모티콘할인행사 {
    int []sales = {40 ,20, 30, 10};
    int []discountRate;
    boolean []visited = new boolean[4];
    int []answer = new int[2];

    public void dfs(int depth , int len , int[][] users , int[] emoticons) {
        if(depth == len) {
            int total = 0;
            int cnt = 0;
            for(int i=0; i<len; i++) {
                int discountPrice = 0;
                int sum = 0;
                for(int j=0; j<len; j++) {
                    if(users[i][0] > discountRate[j]) continue;
                    int s = 100-discountRate[j];
                    discountPrice =  emoticons[j] * s  / 100;
                    sum += discountPrice;
                }

                if(users[i][1] <= sum){
                    cnt++;
                }else {
                    total += sum;
                }
            }

            if(cnt > answer[0]) {
                answer[0] = cnt;
                answer[1] = total;
            }else if (cnt == answer[0] && total > answer[1]) {
                answer[0] = cnt;
                answer[1] = total;
            }
            return;
        }

        for(int i=0; i< 4; i++) {
            discountRate[depth] = sales[i];
            dfs(depth+1, len ,users , emoticons);
        }

    }

    public int[] solution(int[][] users, int[] emoticons) {
        discountRate = new int[emoticons.length];
        dfs(0, emoticons.length , users, emoticons);
        return answer;
    }

    public static void main(String[] args) {
        이모티콘할인행사 s = new 이모티콘할인행사();
        int [][]users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int []emoticons = {1300,1500,1600,4900};
        s.solution(users ,emoticons);
    }
}
