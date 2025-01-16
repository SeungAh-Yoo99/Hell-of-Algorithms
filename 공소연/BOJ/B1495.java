// 문제 링크: https://www.acmicpc.net/problem/1495
// 시간: 68ms
// 메모리: 11796KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] dp = new boolean[n + 1][m + 1]; // i번째 순서의 볼륨(j)

        dp[0][s] = true;
        int max = -1;
        st = new StringTokenizer(br.readLine());
        int num;
        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(st.nextToken());
            for (int j = 0; j <= m; j++) {
                if (dp[i - 1][j]) {
                    if (j + num <= m) {
                        dp[i][j + num] = true;
                        if (i == n) max = Math.max(max, j + num);
                    }
                    if (j - num >= 0) {
                        dp[i][j - num] = true;
                        if (i == n) max = Math.max(max, j - num);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
