// 문제 링크: https://www.acmicpc.net/problem/10971
// 시간: 64ms
// 메모리: 11828KB

import java.util.*;
import java.io.*;

public class Main {
    static int sum;
    static int min = Integer.MAX_VALUE;
    static int n;
    static boolean[] visited;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        board = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0] = true;
        backtracking(0, 0, 0);

        System.out.println(min);
    }

    private static void backtracking(int depth, int now, int sum) {
        if (sum > min) return;

        if (depth == n - 1 && board[now][0] > 0) {
            min = Math.min(min, sum + board[now][0]);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && board[now][i] > 0) {
                visited[i] = true;
                backtracking(depth + 1, i, sum + board[now][i]);
                visited[i] = false;
            }
        }
    }
}
