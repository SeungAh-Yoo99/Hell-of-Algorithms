// 문제 링크: https://www.acmicpc.net/problem/1932
// 시간: 204ms
// 메모리: 24684KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n]; // i층 j까지의 합

        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], -1);
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                arr[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        int max = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 0) {
                    if (j > 0) {
                        dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                    } else {
                        dp[i][j] = arr[i][j] + dp[i - 1][j];
                    }
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        System.out.println(max);
    }
}
