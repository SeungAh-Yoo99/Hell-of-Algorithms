package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1753
// 시간: ms
// 메모리: KB

import java.io.*;
import java.util.*;

public class B1753 {
    static List<List<int[]>> graph;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken()); // 정점
        int E = Integer.parseInt(st.nextToken()); // 간선
        int S = Integer.parseInt(br.readLine()); // 시작 정점

        graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken()); // 시작점
            int value = Integer.parseInt(st.nextToken()); // 끝점
            graph.get(start).add(new int[] {end, value}); // 가중치
        }

        result = new int[V + 1];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[S] = 0;

        /* 다익스트라 알고리즘 */
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[] {S, 0});

        while (!pq.isEmpty()) {
            int[] now = pq.poll(); // 현재 위치
            if (result[now[0]] < now[1]) continue; // 지금이 최단이 아니면 건너뛰기
            for (int[] arr : graph.get(now[0])) { // 현재 위치에서 갈 수 있는 노드 순회
                if (result[arr[0]] > result[now[0]] + arr[1]) { // 지금이 최단인 경우만 수행
                    result[arr[0]] = result[now[0]] + arr[1]; // 더 작은 값으로 업데이트
                    pq.add(new int[] {arr[0], result[arr[0]]}); // 더 작아진 값을 pq에 추가
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (result[i] == Integer.MAX_VALUE) sb.append("INF").append("\n");
            else sb.append(result[i]).append("\n");
        }

        bw.append(sb.toString());
        bw.close();
    }
}
