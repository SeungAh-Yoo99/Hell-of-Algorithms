//문제 링크: https://www.acmicpc.net/problem/2346
//시간: 164ms
//메모리: 16680KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            deque.offer(new int[] {i + 1, num}); // 풍선 번호, 풍선 이동
        }

        List<Integer> answer = new ArrayList<>();
        while (true) {
            int[] balloon = deque.poll();
            bw.write(balloon[0] + " ");

            answer.add(balloon[0]);

            if (deque.isEmpty()) {
                break;
            }

            if (balloon[1] > 0) {
                for (int i = 0; i < balloon[1] - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            }
            else {
                balloon[1] = (-balloon[1]) % deque.size();
                if (balloon[1] == 0) {
                    continue;
                }
                for (int i = 0; i < balloon[1]; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        bw.flush();
        bw.close();
    }

}

