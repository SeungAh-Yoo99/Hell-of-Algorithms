//문제 링크: https://www.acmicpc.net/problem/2606
//시간: 68 ms
//메모리: 11716 KB

import java.io.*;
import java.util.*;

public class boj2606_BFS_2 {

	static int[][] computer;
	static boolean[] visited;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		// 배열 초기화 
		computer = new int[N][N];
		visited = new boolean[N];
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			
			// 무방향 그래프니까 [A][B], [B][A] 모두 1 해줌
			computer[A][B] = 1;
			computer[B][A] = 1;
		}
		
		 bfs(0);
		 System.out.println(cnt);
	}
	
	public static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<>();
		// 우선 queue에 넣고 방문처리
		queue.add(index);
		visited[index] = true;
		
		// queue가 빌때까지 반복
		while(!queue.isEmpty()) {
			// queue 값을 index로 재할당
			index = queue.remove();
			
			// computer[index][j] 반복
			for(int j=0; j<computer.length; j++) {
				if(computer[index][j] == 1 && visited[j] == false) {
					queue.add(j);
					visited[j] = true;
					cnt++;
				}
			}
		}
	}

}

