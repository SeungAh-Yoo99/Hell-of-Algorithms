//문제 링크: https://www.acmicpc.net/problem/2606
//시간: 100ms
//메모리: 14204KB

import java.util.*;
import java.io.*;

public class B2606 {

    static int n = 0;
    static int[][] arr;
    static int N;
    static int M;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 컴퓨터 수
        M = Integer.parseInt(br.readLine()); // 쌍의 수
        arr = new int[N + 1][N + 1]; // 컴퓨터 번호가 1부터 시작하므로 N+1로 배열 생성

        for (int i = 0; i < M ; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            // 양방향 그래프를 고려
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1]; // 방문 여부를 체크하는 배열
        dfs(1); // 1번 컴퓨터부터 탐색 시작
        System.out.println(cnt);
    }

    static void dfs(int n) {
        visited[n] = true; // 해당 컴퓨터를 방문하면 true로 변경

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && arr[n][i] == 1) { // 컴퓨터를 방문하지 않았지만 연결된 컴퓨터이면
                cnt++; // 카운트 증가
                dfs(i); // 해당 컴퓨터로 이동하여 다시 탐색
            }
        }
    }
}
