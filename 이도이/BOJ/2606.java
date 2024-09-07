문제 링크: https://www.acmicpc.net/problem/2606
시간: 96ms
메모리: 14176KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int[][] virusArr;
  static boolean[] visited;
  static int count = 0;

     public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       n = Integer.parseInt(br.readLine());
       virusArr = new int[n+1][n+1];
       visited = new boolean[n+1];


       int m = Integer.parseInt(br.readLine());

       StringTokenizer st;
       for(int i=0;i<m; i++){
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         virusArr[a][b] = 1;
         virusArr[b][a] = 1;
       }

       dfs(1);
       System.out.println(count);

     }

     static void dfs(int num){
           visited[num] = true;
           for(int i=1; i<n+1; i++){
             if(!visited[i] && virusArr[num][i] == 1){
               count++;
               dfs(i);
             }
           }
     }

}
