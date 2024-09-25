//문제 링크: https://www.acmicpc.net/problem/2606
//시간: 64 ms
//메모리: 11620 KB

import java.io.*;
import java.util.*;

public class boj2606 {
	static int[][] graph;
	static boolean[] visited;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		graph = new int[N][N];
		visited = new boolean[N];		
				
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			graph[A][B] = 1;
			graph[B][A] = 1;
		}

		dfs(0);
		System.out.println(cnt);
	}
	
	static void dfs(int index) {
		visited[index] = true;
		
		for(int i=0; i<graph.length; i++) {
			if(graph[index][i]==1 && !visited[i]) {
				cnt++;
				dfs(i);
			}
		}
	}
}

