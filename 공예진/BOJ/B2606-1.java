//문제 링크: https://www.acmicpc.net/problem/2606
//시간: 108ms
//메모리: 14340KB

import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static int N;
    static int S;
    static int answer = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N + 1];

        for (int i = 0; i < S; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a]= 1;
        }

        bfs(1);
        System.out.println(answer);
    }

    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        queue.add(n);
        visited[n]=true;

        while (!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 1; i <= N; i++) {
                if (!visited[i] && arr[num][i] == 1) {
                    answer++;
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }
}
