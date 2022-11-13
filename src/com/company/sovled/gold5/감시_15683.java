package com.company.sovled.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class CCTV {
    int x, y, sort;

    public CCTV(int x, int y, int sort) {
        this.x = x;
        this.y = y;
        this.sort = sort;
    }
}

public class 감시_15683 {
    static int n, m, ans = 0;
    static int office[][];
    static List<CCTV> cctvList;
    static int dx[] = {-1, 0, 1, 0}; // 북 , 동 , 남 , 서
    static int dy[] = {0, 1, 0, -1};
    static int cctv_sort [] = {0,4,2,4,4,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        office = new int[n][m];
        cctvList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                office[i][j] = Integer.parseInt(st.nextToken());
                if (office[i][j] >= 1 && office[i][j] <= 5) {
                    cctvList.add(new CCTV(i, j, office[i][j]));
                }
                if (office[i][j] == 0) {
                    ans++;
                }
            }
        }
        int len = cctvList.size();
        dfs(0, len);
        System.out.println(ans);
    }

    public static void dfs(int L, int len) {
        if (L == len) {
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (office[i][j] == 0) {
                        c++;
                    }
                }
            }
            ans = Math.min(ans, c);
            return;
        }
        int temp[][] = new int[n][m];
        CCTV cctv = cctvList.get(L);

        for (int direction = 0; direction < cctv_sort[cctv.sort]; direction++) {
            copyArray(temp,office); // i 는 0~3 => 북 , 동 , 남 , 서
            searchOffice(direction, cctv.sort, cctv.x, cctv.y);
            dfs(L + 1, len);
            copyArray(office,temp);
        }
    }
    public static void copyArray(int origin[][] , int copied[][]){
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                origin[i][j] = copied[i][j];
            }
        }
    }

    public static void searchOffice(int dir, int sort, int x, int y) {
        if (sort == 1) {
            search(dir,x,y);
            return;
        }
        if (sort == 2) {
            search(dir,x,y);
            search(dir+2,x,y);
            return;
        }
        if (sort == 3) {
            search(dir,x,y);
            search(dir+1,x,y);
            return;
        }
        if (sort == 4) {
            search(dir,x,y);
            search(dir+1,x,y);
            search(dir+2,x,y);
            return;
        }
        if (sort == 5) {
            search(dir,x,y);
            search(dir+1,x,y);
            search(dir+2,x,y);
            search(dir+3,x,y);
            return;
        }
    }
    public static void search(int dir, int x ,int y) {
        dir %= 4;
        while (true) {
            x += dx[dir];
            y += dy[dir];
            if (OOB(x,y) || office[x][y] == 6) {
                return;
            }
            if (office[x][y] == 0) {
                office[x][y] = 7;
            }
        }
    }
    public static boolean OOB(int x ,int y){
        return x < 0 || x>= n || y < 0 || y>= m;
    }

}
