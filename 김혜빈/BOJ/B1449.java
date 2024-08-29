package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1449
// 시간: 68 ms
// 메모리: 11612 KB

import java.util.*;
import java.io.*;

public class B1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물이 새는 위치의 개수
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N]; // 위치 배열
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr); // 오름차순 정렬

        int tmp = arr[0]; // 테이프를 새롭게 붙이는 시작 위치
        int cnt = 1; // 붙일 테이프의 총 개수

        for(int i:arr) {
            if(i - tmp < L) continue; // 테이프를 새롭게 붙이는 위치부터 다음 물이 새는 위치까지 L로 만족되면 다음 위치로 continue
            tmp = i; // 테이프를 새롭게 붙이는 시작 위치가 현재 위치로 change
            cnt ++; // 테이프의 개수 증가
        }

        System.out.println(cnt);
    }
}