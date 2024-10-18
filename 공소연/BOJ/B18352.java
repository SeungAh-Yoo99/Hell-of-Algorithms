// 문제 링크: https://www.acmicpc.net/problem/18352
// 시간: 1192ms
// 메모리: 286644KB

import java.util.*;
import java.io.*;

public class Main {
    static class Node {
        int node;
        int dist;

        Node(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int A, B;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            graph.get(A).add(new Node(B, 1));
        }

        int[] dist = new int[n + 1]; // x에서 시작해서 i번째까지의 거리
        Arrays.fill(dist, 300000);
        Queue<Node> q = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);
        q.offer(new Node(x, 0));
        dist[x] = 0;

        Node cur;
        while (!q.isEmpty()) {
            cur = q.poll();

            if (dist[cur.node] < cur.dist) continue;

            for (Node adj : graph.get(cur.node)) {
                if (dist[adj.node] > cur.dist + 1) {
                    dist[adj.node] = cur.dist + 1;
                    q.offer(new Node(adj.node, dist[adj.node]));
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (dist[i] == k) sb.append(i).append("\n");
        }

        System.out.println(sb.length() == 0 ? -1 : sb);
    }
}
