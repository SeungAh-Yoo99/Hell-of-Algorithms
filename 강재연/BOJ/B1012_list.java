//문제 링크: https://www.acmicpc.net/problem/1012
//시간: 116 ms
//메모리: 13952 KB

import java.io.*;
import java.util.*;

public class boj1012_list {

	static int[] X = {0, 0, 1, -1};
	static int[] Y = {1, -1, 0, 0};
	static List<List<Integer>> field;
	static boolean[][] visited;
	
	static int M;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			// 그래프 초기화
			field = new ArrayList<>();
			for(int h=0; h<M; h++) {
				field.add(new ArrayList<Integer>());
			}
			
			// 배열 초기화
			visited = new boolean[M][N];
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				field.get(A).add(B);
			}
			
			int count =0; 
			
			// 모든 그래프를 순회 
			// 방문하지 않았고, 필드에 배추가 심어져 있는 부분만 bfs() 
			for(int m=0; m<M; m++) {
				for(int n=0; n<N; n++) {
					if(!visited[m][n] && field.get(m).contains(n)) {
						bfs(m,n);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			x = current[0];
			y = current[1];
			
			for(int k=0; k<4; k++) {
				int newX = x + X[k];
				int newY = y + Y[k];
				
				// newX와 newY가 배추밭의 범위안에 있고, 방문하지 않았고, 배추가 심어져 있을때만 큐에 추가
				if(newX >= 0 && newY >= 0 && newX < M && newY < N && !visited[newX][newY] && field.get(newX).contains(newY)) {
					queue.add(new int[]{newX,newY});
					visited[newX][newY] = true;
				}
			}
		}
	}

}
