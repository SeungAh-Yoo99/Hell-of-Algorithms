package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2293
// 시간: 76 ms
// 메모리: 11636 KB

import java.io.*;
import java.util.*;

public class B2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n]; // 동전의 가치 배열
        for (int i = 0; i < n; i++) coins[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[k + 1];
        dp[0] = 1;


        for (int coin : coins) { // 각 동전마다 경우의 수 업데이트
            for (int i = coin; i <= k; i++) dp[i] += dp[i - coin];
        }

        System.out.println(dp[k]);
    }
}
