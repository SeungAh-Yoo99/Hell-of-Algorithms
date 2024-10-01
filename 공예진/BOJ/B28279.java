//문제 링크: https://www.acmicpc.net/problem/28279
//시간: 1144ms
//메모리: 256408KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1 :
                    int X1 = Integer.parseInt(st.nextToken());
                    deque.offerFirst(X1);
                    break;

                case 2 :
                    int X2 = Integer.parseInt(st.nextToken());
                    deque.offerLast(X2);
                    break;

                case 3 :
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");
                    }
                    break;

                case 4 :
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");
                    }
                    break;

                case 5 :
                    bw.write(deque.size() + "\n");
                    break;

                case 6 :
                    if (deque.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case 7 :
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;

                case 8 :
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();

    }

}
