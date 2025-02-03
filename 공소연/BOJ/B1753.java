// 링크: https://www.acmicpc.net/problem/1753
// 시간: 664ms
// 메모리: 108736KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node {
        int dst;
        int cost;

        Node(int dst, int cost) {
            this.dst = dst;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken()); // 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수

        int K = Integer.parseInt(br.readLine()); // 시작 정점의 번호

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(src).add(new Node(dest, cost));
        }

        int[] costs = new int[V + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);
        costs[K] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        pq.offer(new Node(K, 0));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();

            if (poll.cost > costs[poll.dst]) continue;

            for (Node adjNode : graph.get(poll.dst)) {
                int newCost = adjNode.cost + poll.cost;
                if (newCost < costs[adjNode.dst]) {
                    costs[adjNode.dst] = newCost;
                    pq.offer(new Node(adjNode.dst, newCost));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            sb.append(costs[i] == Integer.MAX_VALUE ? "INF" : costs[i]).append("\n");
        }

        System.out.println(sb);
    }
}
