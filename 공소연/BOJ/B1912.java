문제 링크: https://www.acmicpc.net/problem/1912
시간: 172ms
메모리: 21980KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(st.nextToken());

            dp[i] = num < dp[i - 1] + num ? dp[i - 1] + num : num;
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
