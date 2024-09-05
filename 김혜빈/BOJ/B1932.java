package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1932
// 시간: 184 ms
// 메모리: 24936 KB

import java.io.*;
import java.util.*;

public class B1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] triangle = new int[n][n]; // 삼각형 배열
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++) triangle[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][n]; // dp 배열
        dp[0][0] = triangle[0][0]; // 첫 번째는 무조건 삼각형 배열의 첫 번째 인덱스 값

        for(int i=1; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(j == 0) dp[i][0] = dp[i - 1][0] + triangle[i][0]; // j = 0 인 경우 윗 삼각형에서 맨 왼쪽 인덱스 값만 추가
                else if(j == i) dp[i][j] = dp[i - 1][j - 1] + triangle[i][j]; // j = i 인 경우 삼각형에서 맨 오른쪽 인덱스 값만 추가
                else dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]; // 나머지의 경우 본인 인덱스의 왼오 둘다 고려
            }
        }

        int max = dp[n - 1][0]; // 0번째 인덱스를 기본 맥스값으로 설정
        for(int i=1; i<n; i++) max = Math.max(max, dp[n - 1][i]); // 맥스값 구하기
        System.out.println(max);
    }
}
