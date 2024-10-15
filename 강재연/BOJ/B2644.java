//문제 링크: https://www.acmicpc.net/problem/2644
//시간: 68 ms
//메모리: 11684 KB

import java.io.*;
import java.util.*;

public class boj2644 {
	
	static int y;
	static int M;
	static int cnt = 0;
	static boolean[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		graph = new boolean[N][N]; // 그래프 배열
		visited = new boolean[N]; // 큐 방문 배열
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1; // 시작점
		y = Integer.parseInt(st.nextToken()) - 1; // 도착점
		
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			
			graph[a][b] = true;
			graph[b][a] = true;
		}
		
		System.out.println(bfs(x));
	}
	
	static int bfs(int index) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {index, 0}); // int[]로 배열 선언 {index, cnt} 
		visited[index] = true;
		
		while(!queue.isEmpty()) {	
			int[] current = queue.poll(); // 최상위 배열 뽑음
			index = current[0];
			cnt = current[1];
			
			if(index == y) return cnt; // 만약 index가 도착점이면 return cnt
			
			for(int j=0; j<graph.length; j++) {
				if(graph[index][j] && !visited[j]) {
					queue.add(new int[]{j,cnt+1});
					visited[j] = true;
				}
			}
		}
		return -1; // 전부 순회했는데도 도착점에 방문하지 못했다면 return -1 
	}

}
