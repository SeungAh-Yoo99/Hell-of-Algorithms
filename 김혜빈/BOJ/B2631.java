package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2631
// 시간: 68 ms
// 메모리: 11512 KB

import java.io.*;
import java.util.*;

public class B2631 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 아이들의 수
        int[] arr = new int[N]; // 아이들의 번호
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1); // 자기자신을 포함하므로 모두 1

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) { // arr[i] 가 더 크면 arr[j] 뒤로 갈 수 있음
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0; // 최댓값
        for (int i : dp) max = Math.max(max, i);

        System.out.println(N - max);
    }
}
