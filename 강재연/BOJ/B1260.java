//문제 링크: https://www.acmicpc.net/problem/1260
//시간: 180 ms
//메모리: 17860 KB

import java.io.*;
import java.util.*;

public class boj1260 {
	
	static int N;
	static boolean[][] graph;
	static StringBuilder sb = new StringBuilder();
	
	static boolean[] visitedD;
	static boolean[] visitedB;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		graph = new boolean[N][N]; // 정점의 개수만큼 2차원 배열 초기화
		visitedD = new boolean[N]; // dfs에서 사용할 방문 배열
		visitedB = new boolean[N]; // bfs에서 사용할 방문 배열
		
		String line = "";
		while((line = br.readLine()) != null && !line.isEmpty()) {
			st = new StringTokenizer(line);
			
			// 그래프니까 양방향 맵핑
			int a = Integer.parseInt(st.nextToken()) -1;
			int b = Integer.parseInt(st.nextToken()) -1;
			graph[a][b] = true;
			graph[b][a] = true;
			
		}
		
		dfs(V-1);
		sb.append("\n");
		bfs(V-1);
		System.out.println(sb);
	}
	
	
	public static void dfs(int index) {
		visitedD[index] = true;
		sb.append(index+1).append(" ");
		
		for(int i=0; i<graph.length; i++) {
			// 그래프가 true고, 방문배열이 false일때
			if(graph[index][i] && !visitedD[i]) {
				// 재귀
				dfs(i);
			}
		}
	}

	public static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(index);
		visitedB[index] = true;
		sb.append(index+1).append(" ");
		
		while(!queue.isEmpty()) {
			index = queue.poll();
						
			for(int i=0; i<graph.length; i++) {
				// 그래프가 true고, 방문배열이 false일때
				if(graph[index][i] && !visitedB[i]) {
					// queue에 추가
					queue.add(i);
					visitedB[i] = true;
					sb.append(i+1).append(" ");
				}
			}			
		}	
	}
}
