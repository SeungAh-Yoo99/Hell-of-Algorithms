package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1806
// 시간: 196 ms
// 메모리: 22680 KB

import java.io.*;
import java.util.StringTokenizer;

public class B1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수의 개수
        int S = Integer.parseInt(st.nextToken()); // 최소 부분합
        int[] arr = new int[N + 1]; // 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int p1 = 1; // 포인터1
        int p2 = 1; // 포인터2

        int sum = arr[1]; // 구간의 합
        int cnt = 1; // 구간의 개수
        int min = Integer.MAX_VALUE; // 출력될 값

        while (p1 <= N) { // p1이 끝에 도달하기 전까지 진행
            if (sum >= S) { // 구간의 합이 최소 부분합을 만족하는 경우
                min = Math.min(min, cnt);
                sum -= arr[p1];
                p1++;
                cnt--;
            } else if (p2 < N) { // 최소 부분합을 만족하지 않지만 p2가 아직 끝에 도달하지 않은 경우
                p2++;
                cnt++;
                sum += arr[p2];
            } else break; // 최소 부분합을 만족하지 않는데 p2가 끝에 도달한 경우 종료
        }

        System.out.println(min == Integer.MAX_VALUE ? 0 : min); // 최소 부분합을 만족하는 구간이 없다면 0 출력
    }
}
