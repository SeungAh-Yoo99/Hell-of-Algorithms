// 문제링크: https://www.acmicpc.net/problem/11403
// 시간: 128ms
// 메모리: 13672KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int INF = (int) 1e9;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        int num;
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], INF);
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                num = Integer.parseInt(st.nextToken());
                if (num == 1) board[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    board[j][k] = Math.min(board[j][k], board[j][i] + board[i][k]);
                }
            }
        }

        for (int[] row : board) {
            for (int nu : row) {
                if (nu == INF) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
