/**
 * 문제 링크: https://www.acmicpc.net/problem/1182
 * 시간: 112ms
 * 메모리: 14216KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package BOJ;

import java.util.*;
import java.io.*;

public class B1182 {
    static int N, S, count;
    static int[] arr;

    public static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) count++;
            return;
        }
        dfs(depth+1, sum+arr[depth]);
        dfs(depth+1, sum);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        if (S == 0) count--; // 공집합 제외
        System.out.println(count);
    }
}