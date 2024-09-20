// 문제 링크: https://www.acmicpc.net/problem/1449
// 시간: 72ms
// 메모리: 11604KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] holes = new int[N];

        for (int i = 0; i < N; i++) {
            holes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holes);

        int max = 0; // 테이프가 닿을 수 있는 최대 위치
        int answer = 0; // 테이프의 개수
        for (int i = 0; i < N; i++) {
            if (max < holes[i]) {
                max = holes[i] + L - 1;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
