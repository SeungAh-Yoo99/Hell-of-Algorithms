// 링크: https://www.acmicpc.net/problem/11375
// 메모리: 69256KB
// 시간: 1172ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    // 각 일에 매칭된 직원 저장
    static int[] match;

    // 현재 직원의 일에 대한 방문 여부 저장
    static boolean[] visited;

    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        match = new int[m];
        Arrays.fill(match, -1);

        // 할 수 있는 일의 번호 저장
        int[][] workMap = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j < k; j++) {
                int work = Integer.parseInt(st.nextToken()) - 1;
                workMap[i][work] = 1;
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            visited = new boolean[m];
            if (dfs(i, workMap)) {
                result++;
            }
        }

        System.out.println(result);
    }

    // i가 일에 매칭될 수 있는지 확인하는 DFS
    static boolean dfs(int student, int[][] workMap) {
        for (int work = 0; work < m; work++) {
            if (workMap[student][work] == 1) {
                if (!visited[work]) {
                    visited[work] = true;

                    if (match[work] == -1 || dfs(match[work], workMap)) {
                        match[work] = student;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
