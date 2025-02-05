// 링크: https://www.acmicpc.net/problem/1976
// 시간: 160ms
// 메모리: 17420KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 도시의 수
        int m = Integer.parseInt(br.readLine()); // 여행 계획에 속한 도시들의 수

        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }

        // 연결 정보
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    union(i, j);
                }
            }
        }
        
        // 여행 계획
        st = new StringTokenizer(br.readLine());
        String answer = "YES";
        Integer parent = null;
        for (int i = 0; i < m; i++) {
            int node = Integer.parseInt(st.nextToken()) - 1;
            int parent_node = find(node);
            if (parent != null && parent != parent_node) {
                answer = "NO";
                break;
            }
            parent = parent_node;
        }
        
        System.out.println(answer);
    }

    static void union(int a, int b) {
        int parent_a = find(a);
        int parent_b = find(b);

        if (parent_a != parent_b) parents[parent_b] = parent_a;
    }

    static int find(int node) {
        if (parents[node] == node) return node;
        return parents[node] = find(parents[node]);
    }
}
