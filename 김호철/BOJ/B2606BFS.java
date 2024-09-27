package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/2606
// 시간: 11700 ms
// 메모리: 68 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606BFS {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    static int cnt=-1; //
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int temp = Integer.parseInt(br.readLine()); // 반복해서 입렵 받을 수
        StringTokenizer st;
        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        int x,y;
        for(int i = 0 ; i<temp;i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y]=true;
            graph[y][x]=true;
        }
        q.offer(1);
        while(!q.isEmpty()) {

            int i = q.poll();
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == true && !visited[j]) {
                    q.offer(j); //큐에 넣고
                    cnt++; // 카운트 값 더하고
                    visited[j] = true; // 방문 처리
                }
            }
        }
        if(cnt==-1) cnt = 0; // 하나도 방문 안했다면 0으로 바꿈
        System.out.println(cnt);
    }
}
