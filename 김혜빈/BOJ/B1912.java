package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1912
// 시간: 164 ms
// 메모리: 21288 KB

import java.io.*;
import java.util.*;

public class B1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int max = arr[0]; // 최댓값
        int now = arr[0]; // 부분합

        for (int i = 1; i < n; i++) {
            now = Math.max(arr[i], now + arr[i]); // 현재 수를 포함한 합 VS 현재 수
            max = Math.max(max, now); // 최댓값 갱신
        }

        System.out.println(max);
    }
}
