package com.company.programmers.level2;

public class 이모티콘할인행사2 {

    int []discountRate = {40 ,40, 20, 40};
    int []answer = new int[2];

    public void dfs(int depth , int len , int[][] users , int[] emoticons) {
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
        }

    public int[] solution(int[][] users, int[] emoticons) {
        dfs(0, emoticons.length , users, emoticons);
        return answer;
    }

    public static void main(String[] args) {
        이모티콘할인행사2 s = new 이모티콘할인행사2();
        int [][]users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int []emoticons = {1300,1500,1600,4900};
        s.solution(users ,emoticons);
    }
}
