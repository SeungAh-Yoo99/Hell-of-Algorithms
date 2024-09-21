//문제 링크: https://www.acmicpc.net/problem/1158
//시간: 664ms
//메모리: 295016KB

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(i+1);
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {

            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            answer.add(queue.poll());

        }
        System.out.print("<");
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.print(answer.get(i) + ">");
            } else {
                System.out.print(answer.get(i) + ", ");
            }
        }
    }
}
