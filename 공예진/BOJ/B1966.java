//문제 링크: https://www.acmicpc.net/problem/1966
//시간: ms
//메모리: KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[] {j, num});
            }

            while (!queue.isEmpty()) {
                int[] selected = queue.poll();

                for (int[] arr : queue) {
                    if (selected[1] < arr[1]) {
                        queue.add(selected);
                        break;
                    }
                }
            }
        }
    }
}
