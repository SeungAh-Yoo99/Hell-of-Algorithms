//문제 링크: https://www.acmicpc.net/problem/11724
//시간: 440ms
//메모리: 118648KB

import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i ++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    static void dfs (int n) {
        visited[n] = true;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && arr[n][i] == 1) {
                dfs(i);
            }
        }
    }

}
