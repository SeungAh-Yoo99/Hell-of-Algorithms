package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/13164
// 시간: 436 ms
// 메모리: 63488 KB

import java.io.*;
import java.util.*;

public class B13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 유치원생 수
        int K = Integer.parseInt(st.nextToken()); // 조의 개수
        int[] arr = new int[N]; // 원생들의 키 배열

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] sub = new int[N-1]; // 키 간 차이 배열
        for(int i=0; i<sub.length; i++) sub[i] = arr[i+1] - arr[i];

        Arrays.sort(sub);
        int sum = 0; // 티셔츠 만드는 비용
        int size = N-K; // 더할 개수 (차이가 큰 값의 개수)
        for(int i=0; i<size; i++) sum += arr[i]; // 차이가 큰 값을 빼고 합산

        System.out.println(sum);
    }
}
