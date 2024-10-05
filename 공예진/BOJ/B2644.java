//문제 링크: https://www.acmicpc.net/problem/2644
//시간: 64ms
//메모리: 11628KB

import java.util.*;
import java.io.*;

public class Main {
    static int N, start, end;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        visited = new boolean[N + 1];
        dfs(start, 0);
        System.out.println(result);
    }

    static void dfs(int person, int degree) {
        if (person == end) {
            result = degree;
            return;
        }

        visited[person] = true;

        for (int next : list[person]) {
            if (!visited[next]) {
                dfs(next, degree + 1);
            }
        }
    }
}
