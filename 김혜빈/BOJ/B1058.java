package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1058
// 시간: 64 ms
// 메모리: 11836 KB

import java.io.*;
import java.util.*;

public class B1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(new ArrayList<>());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) if (s.charAt(j) == 'Y') list.get(i).add(j);
        }

        int max = 0; // 최대
        final int MAX = N - 1; // N명이 있는 경우 2-친구의 최대 수

        for (int i = 0; i < N; i++) {
            int cnt = 0; // 친구 개수
            boolean[] visited = new boolean[N];
            visited[i] = true;
            List<Integer> tmp = list.get(i);
            for (int j : tmp) {
                if (!visited[j]) {
                    cnt++;
                    visited[j] = true;
                }
                List<Integer> tmp2 = list.get(j);
                for (int k : tmp2) {
                    if (!visited[k]) {
                        cnt++;
                        visited[k] = true;
                    }
                }
            }
            max = Math.max(max, cnt);
            if (max == MAX) break; // 최대가 되면 break
        }

        System.out.println(max);
    }
}
