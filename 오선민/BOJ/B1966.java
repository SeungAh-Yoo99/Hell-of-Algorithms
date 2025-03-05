/**
 * 문제 링크: https://www.acmicpc.net/problem/1966
 * 시간: 128ms
 * 메모리: 15056KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // q[0]: 인덱스, q[1]: 중요도
            Queue<int[]> q = new LinkedList<>();
            StringTokenizer levelSt = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < N; j++) {
                int level = Integer.parseInt(levelSt.nextToken());
                q.offer(new int[]{j, level});
            }

            int printOrder = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                boolean isPrint = true;

                for (int[] doc : q) {
                    if (doc[1] > cur[1]) {
                        isPrint = false;
                        break;
                    }
                }

                if (isPrint) {
                    printOrder++;
                    if (cur[0] == M) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    q.offer(cur);
                }
            }
        }
    }
}
