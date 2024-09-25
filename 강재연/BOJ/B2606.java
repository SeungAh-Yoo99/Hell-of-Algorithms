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
		
		computer = new int[N][N];
		visited = new boolean[N];
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			computer[A][B] = 1;
			computer[B][A] = 1;
		}
		
		for(int k=0; k<computer.length; k++) {
			System.out.println(Arrays.toString(computer[k]));
		}
		
		 bfs(0);
		 System.out.println(cnt);
	}
	
	public static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(index);
		visited[index] = true;
		
		while(!queue.isEmpty()) {
			index = queue.remove();
			
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
