//문제 링크 https://www.acmicpc.net/problem/1697
//시간 148ms
//메모리 18860KB



import java.io.*;
import java.util.*;

public class Main {
    static int numN;
    static int numK;
    static int[] check = new int[100001];

    static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        check[num] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == numK) {
                    System.out.println(check[temp]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        numN = Integer.parseInt(st.nextToken());
        numK = Integer.parseInt(st.nextToken());

        if (numN == numK) {
            System.out.println(0);
        } else {
            bfs(numN);
        }
        br.close();
    }
}
