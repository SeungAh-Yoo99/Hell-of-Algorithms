package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/14501
// 시간: 64 ms
// 메모리: 11728 KB

import java.io.*;
import java.util.StringTokenizer;

public class B14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 퇴사일
        int[][] arr = new int[N][2]; // 날짜 별 상담 정보 배열

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            if (arr[i][0] + i > N) arr[i][1] = 0; // 상담일이 퇴사일을 넘어가면 보상 0으로 저장
            else arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N + 1]; // N인 경우는 0일 (마지막 날까지 일하는 경우 배열 초과 방지)
        dp[N - 1] = arr[N - 1][1];

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i][1] == 0) dp[i] = dp[i + 1]; // 보상이 0인 경우 무조건 이후 인덱스가 최대
            else dp[i] = Math.max(dp[i + 1], arr[i][1] + dp[i + arr[i][0]]); // 아닌 경우 '이후 인덱스' VS '현재 보상 + 현재 상담이 끝난 이후의 보상 최대' 비교
        }

        System.out.println(dp[0]); // 배열을 거꾸로 돌았으므로 0이 최대
    }
}
