package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/12865
// 시간: 104 ms
// 메모리: 12124 KB

import java.io.*;
import java.util.*;

public class B12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 최대 무게

        int[] weight = new int[N + 1]; // 무게 배열
        int[] value = new int[N + 1]; // 가치 배열

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        /* DP 배열에 들어가는 값은 각 무게 별로 가능한 최대 가치합 */
        int[] dp = new int[K + 1];

        for (int i = 1; i <= N; i++) {
            // i 는 무게 배열을 조회할 인덱스
            // j 는 무게 -> 최대 무게 부터 시작하여 무게 배열의 i 번째 무게까지 반복문 실행
            for (int j = K; j >= weight[i]; j--) {
                // 현재 물품을 배낭에 넣는 경우와 안 넣는 경우를 비교하여 배열에 값 추가
                // 넣는 경우 현재 물품의 무게를 제외한 부분에서의 최댓값에 현재 물품의 가치를 덧셈
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }

        System.out.println(dp[K]);
        br.close();
    }
}
