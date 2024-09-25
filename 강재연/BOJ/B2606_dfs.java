import java.io.*;
import java.util.*;

public class boj2606 {
	static int[][] graph;
	static boolean[] visited;
	static int cnt = 0;
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		graph = new int[N][N];
		visited = new boolean[N];
		StringTokenizer st;
				
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			graph[A][B] = 1;
			graph[B][A] = 1;
		}
		for(int k=0; k<graph.length; k++) {
			System.out.println(Arrays.toString(graph[k]));
		}
		dfs(0);
		System.out.println(cnt);
	}
	
	static void dfs(int index) {
		visited[index] = true;
		for(int i=0; i<N; i++) {
			if(graph[index][i]==1 && !visited[i]) {
				cnt++;
				dfs(i);
			}
		}
	}
}
