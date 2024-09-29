//문제 링크 https://www.acmicpc.net/problem/2606
//시간 100ms
//메모리 14264KB


import java.util.*;
import java.io.*;

public class Main {
    static int count = 0 ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerNum = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());

        boolean[][] graph = new boolean[computerNum+1][computerNum+1];
        StringTokenizer st;
        for (int i = 0; i < connect; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            graph[A][B] = true;
            graph[B][A] = true;
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[computerNum+1];
        int start = 1;
        queue.offer(start);
        visited[start] = true; 

        while (!queue.isEmpty()) {
            int computer = queue.poll();

            for(int i=1; i < computerNum+1; i++) {
                if(graph[computer][i] && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
