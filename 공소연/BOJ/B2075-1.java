// 문제 링크: https://www.acmicpc.net/problem/2075
// 시간: 688ms
// 메모리: 296216KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (pq.size() < n) pq.offer(num);
                else if (num > pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }

        System.out.print(pq.poll());
    }
}
