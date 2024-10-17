// 문제링크: https://www.acmicpc.net/problem/11286
// 시간: 284ms
// 메모리: 25464KB	

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) {
                return o1 - o2;
            }
           return Math.abs(o1) - Math.abs(o2);
        });
        
        int num;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!q.isEmpty()) {
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                q.add(num);
            }
        }

        System.out.println(sb);
    }
}
