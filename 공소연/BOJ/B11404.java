// 문제링크: https://www.acmicpc.net/problem/11404
// 시간: 292ms
// 메모리: 41736KB

import java.io.*;
import java.util.*;

public class Main {
	static final int INF = 100_000_001; // 100,000 * 100 + 1
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] board = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(board[i], INF);
			board[i][i] = 0;
		}
		
		StringTokenizer st;
		int start, end, cost;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken()) - 1;
			end = Integer.parseInt(st.nextToken()) - 1;
			cost = Integer.parseInt(st.nextToken());
			board[start][end] = Math.min(board[start][end], cost); // 노선이 하나가 아닐 수 있으므로
		}
		
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					board[i][j] = Math.min(board[i][j], board[i][k] + board[k][j]);
				}
			}
		}
		
		for (int[] row : board) {
			for (int num : row) {
				if (num == INF) sb.append(0).append(" ");
				else sb.append(num).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
