//문제 링크: https://www.acmicpc.net/problem/1449
//시간: 72ms
//메모리: 11624KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        double start = arr[0] - 0.5;
        int answer = 1;

        for (int i = 0; i < N; i++) {
            if (start + L < arr[i]) {
                answer++;
                start = arr[i] - 0.5;
            }
        }

        System.out.println(answer);
    }
}