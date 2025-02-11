// 링크: https://www.acmicpc.net/problem/10451
// 메모리: 54900KB
// 시간: 460ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] perms;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            perms = new int[n + 1];
            visited = new boolean[n + 1];

            st = new StringTokenizer(br.readLine());

            // 연결 정보
            for (int i = 1; i <= n; i++) {
                perms[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int node) {
        visited[node] = true;

        if (!visited[perms[node]]) {
            dfs(perms[node]);
        }
    }
}
