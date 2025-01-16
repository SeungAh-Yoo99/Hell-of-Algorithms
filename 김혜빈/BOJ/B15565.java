package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/15565
// 시간: 272 ms
// 메모리: 73588 KB

import java.io.*;
import java.util.*;

public class B15565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 인형의 총 개수
        int K = Integer.parseInt(st.nextToken()); // 최소 필요한 라이언 인형의 개수

        boolean[] arr = new boolean[N]; // 인형 배열
        int lion = 0; // 라이언의 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (st.nextToken().equals("1")) {
                arr[i] = true;
                lion++;
            }
        }

        System.out.println(cntSet(lion, N, K, arr)); // 집합 개수를 카운트하는 함수
    }

    private static int cntSet(int lion, int N, int K, boolean[] arr) {
        if (lion < K) return -1; // 집합을 만드는 것이 불가능하므로 -1 반환
        else if (lion == K) { // 가장 앞에 있는 라이언부터 가장 뒤에 있는 라이언까지의 길이 반환
            int start = 0, end = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i]) {
                    start = i;
                    break;
                }
            }
            for (int i = N - 1; i >= 0; i--) {
                if (arr[i]) {
                    end = i;
                    break;
                }
            }
            return end - start + 1;
        } else return twoPointer(N, K, arr);
    }

    private static int twoPointer(int N, int K, boolean[] arr) {
        int p1 = 0, p2 = 0;
        int lion = 0;
        int min = Integer.MAX_VALUE;

        while (p2 < N) {
            if (arr[p2++]) lion++;
            while (lion >= K) {
                min = Math.min(min, p2 - p1);
                if (arr[p1++]) lion--;
            }
        }

        return min;
    }
}
