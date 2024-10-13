// 문제 링크: https://www.acmicpc.net/problem/2638
// 시간: 176ms
// 메모리: 16488KB

import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[][] visited;
	static int[][] board;
	static int n, m;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfsAir(0, 0);
		
		int answer = 0;
		List<int[]> toMelt;
		while (true) {
			toMelt = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (board[i][j] == 1 && shouldMelt(j, i)) {
						toMelt.add(new int[] {j, i});
					}
				}
			}
			
			if (toMelt.isEmpty()) break;
			for (int[] pair : toMelt) {
				board[pair[1]][pair[0]] = -1;
			}
			answer++;
			
            visited = new boolean[n][m];
			dfsAir(0, 0); // 치즈가 녹음으로써 치즈 내부에 있었던 0들도 녹아야 함
		}
		
		System.out.println(answer);
	}
	
	static void dfsAir(int x, int y) {
        board[y][x] = -1;
		visited[y][x] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
			if (board[ny][nx] != 1 && !visited[ny][nx]) {
				dfsAir(nx, ny);
			}
		}
	}
	
	static boolean shouldMelt(int x, int y) {
		int count = 0;
		int nx, ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			
			if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
			if (board[ny][nx] == -1) count++;
		}
		
		return count >= 2;
	}

}
