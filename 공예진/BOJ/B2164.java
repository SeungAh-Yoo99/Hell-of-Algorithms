//문제 링크: https://www.acmicpc.net/problem/2164
//시간: 180ms
//메모리: 61484KB

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        while (queue.size() > 1) {
            queue.remove(queue.peek());
            int n = queue.peek();
            queue.remove(n);
            queue.add(n);
        }

        System.out.println(queue.peek());
    }
}
