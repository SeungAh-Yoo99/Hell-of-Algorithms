// 문제 링크: https://www.acmicpc.net/problem/16507
// 시간: 456ms
// 메모리: 89104KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[][] board = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= C; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                dp[i][j] = board[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        int x1, x2, y1, y2;
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            sb.append((dp[y1][y2] - dp[y1][x2 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][x2 - 1]) / ((y2 - x2 + 1) * (y1 - x1 + 1))).append("\n");
        }

        System.out.println(sb);
    }
}
