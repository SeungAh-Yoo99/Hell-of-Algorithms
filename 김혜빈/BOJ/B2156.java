package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2156
// 시간: 92 ms
// 메모리: 13284 KB

import java.io.*;

public class B2156 {
    /* DP 점화식 */
    // 1. 이전까지의 포도주 최대 개수
    // 2. 그 이전까지의 포도주 최대 개수에 현재 포도주 개수를 더한 개수
    // 3. 3번째 이전의 포도주 최대 개수에 이전 포도주와 현재 포도주 개수를 더한 개수
    /* 3가지 중 가장 큰 값을 dp의 i 번째 인덱스에 추가 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 포도주 개수
        int[] arr = new int[n]; // 각 포도주 양
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[n];
        dp[0] = arr[0];
        if(n > 1) dp[1] = arr[0] + arr[1];
        if(n > 2) dp[2] = Math.max(arr[0] + arr[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));

        for(int i=3; i<n; i++) dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        System.out.println(dp[n-1]);
    }
}
