// 문제 링크: https://www.acmicpc.net/problem/18115
// 시간: 572ms
// 메모리: 158480KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] seq = new String[n];

        for (int i = 0; i < n; i++) {
            seq[i] = st.nextToken();
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            String tech = seq[n - i];
            if (tech.equals("1")) {
                dq.addFirst(i);
            }
            if (tech.equals("2")) {
                int first = dq.removeFirst();
                dq.addFirst(i);
                dq.addFirst(first);
            }
            if (tech.equals("3")) {
                dq.addLast(i);
            }
        }

        for (int num : dq) {
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString());
    }
}
