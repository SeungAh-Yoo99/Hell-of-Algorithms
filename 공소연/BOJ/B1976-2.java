// 링크: https://www.acmicpc.net/problem/1976
// 시간: 164ms
// 메모리: 16968KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<HashSet<Integer>> lists;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 도시의 수
        int m = Integer.parseInt(br.readLine()); // 여행 계획에 속한 도시들의 수

        lists = new ArrayList<>();
        visited = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            lists.add(new HashSet<>());
        }

        // 연결 정보
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    lists.get(i + 1).add(j + 1);
                    lists.get(j + 1).add(i + 1);
                }
            }
        }

        Arrays.fill(visited, -1);

        int groupId = 1;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == -1) {
                dfs(i, groupId, visited);
                groupId++;
            }
        }
        
        // 여행 계획
        st = new StringTokenizer(br.readLine());
        int group = visited[Integer.parseInt(st.nextToken())];
        for (int i = 1; i < m; i++) {
            int route = visited[Integer.parseInt(st.nextToken())];
            if (group != route) {
                group = 0;
                break;
            }
            group = visited[route];
        }

        System.out.println(group == 0 ? "NO" : "YES");
    }

    static void dfs(int node, int groupId, int[] visited) {
        visited[node] = groupId;

        for (int adjNode : lists.get(node)) {
            if (visited[adjNode] == -1) {
                dfs(adjNode, groupId, visited);
            }
        }
    }
}
