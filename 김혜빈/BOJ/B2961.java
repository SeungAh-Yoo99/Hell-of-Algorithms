package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2961
// 시간: 60 ms
// 메모리: 11504 KB

import java.io.*;
import java.util.StringTokenizer;

public class B2961 {
    static int N; // 재료 개수
    static int[][] arr; // 맛 배열
    static int min = Integer.MAX_VALUE; // 신 맛과 쓴 맛의 차이 최솟값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        backTracking(0, 1, 0, 0);
        System.out.println(min);
    }

    private static void backTracking(int idx, int sour, int bitter, int cnt) {
        if (idx == N) { // 배열 탐색 완료
            if (cnt > 0) min = Math.min(min, Math.abs(sour - bitter)); // 재료를 하나라도 선택한 경우 수행
            return;
        }

        backTracking(idx + 1, sour * arr[idx][0], bitter + arr[idx][1], cnt + 1); // 현재 재료를 선택
        backTracking(idx + 1, sour, bitter, cnt); // 현재 재료를 선택 X
    }
}
