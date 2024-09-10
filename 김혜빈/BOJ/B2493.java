package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2493
// 시간: 596 ms
// 메모리: 116024 KB

import java.util.*;
import java.io.*;

public class B2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // top 의 개수
        int[] tops = new int[N + 1]; // top 의 높이 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) tops[i] = Integer.parseInt(st.nextToken());

        Stack<int[]> stack = new Stack<int[]>(); // int[] {index, height}
        int[] result = new int[N + 1]; // 출력 결과 배열

        for(int i=N; i>0; i--) {
            int height = tops[i]; // 현재 탑의 높이
            /* stack 이 비어있지 않고 이전의 탑 높이가 현재 탑의 높이보다 작은 경우 반복문 시작 */
            // 1. 현재 높이보다 낮은 높이들을 모두 방문해야 하므로
            // 2. 바로 이전 탑보다 2번째 이전의 탑이 무조건 높이가 더 크므로 (이전 반복문에서 이 부분은 걸러졌다.)
            while(!stack.isEmpty() && stack.peek()[1] <= height) {
                result[stack.peek()[0]] = i;
                stack.pop();
            }
            stack.add(new int[] {i, height}); // stack 에 현재 탑의 정보를 추가
        }

        for(int i=1; i<=N; i++) sb.append(result[i]).append(" ");
        bw.append(sb.toString());
        bw.close();
    }
}
