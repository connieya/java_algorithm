package com.company.sovled.gold5;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class 이중우선순위큐_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            TreeMap<Integer ,Integer> treeMap = new TreeMap<>();
            while (n-- > 0) {
                 StringTokenizer st = new StringTokenizer(br.readLine());
                 char op = st.nextToken().charAt(0);
                 int num = Integer.parseInt(st.nextToken());
                 if (op == 'I'){
                     treeMap.merge(num,1,Integer::sum);
                 }else if (op == 'D' && !treeMap.isEmpty()){
                    int key = (num == 1) ? treeMap.lastKey() : treeMap.firstKey();
                    if (treeMap.get(key) == 1) treeMap.remove(key);
                    else treeMap.put(key,treeMap.get(key)-1);
                 }
            }
            if (treeMap.isEmpty()){
                bw.write("EMPTY\n");
            }else {
                bw.write(treeMap.lastKey()+" "+treeMap.firstKey()+"\n");
            }
        }
        bw.flush(); bw.close(); br.close();
    }
}
