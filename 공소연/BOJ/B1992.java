// 문제 링크: https://www.acmicpc.net/problem/1992
// 시간: 68ms
// 메모리: 11672KB

import java.io.*;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static char[][] board;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		board = new char[n][n];
		
		String row;
		for (int i = 0; i < n; i++) {
			row = br.readLine();
			for (int j = 0; j < n; j++) {
				board[i][j] = row.charAt(j);
			}
		}
		
		quatre(n, 0, 0);
		
		System.out.println(sb);
	}
	
	static void quatre(int n, int r, int c) {
		if (isUniform(n, r, c)) {
			sb.append(board[r][c]);
		} else {
			sb.append("(");
			
			int half = n / 2;
			quatre(half, r, c);
			quatre(half, r, c + half);
			quatre(half, r + half, c);
			quatre(half, r + half, c + half);
			
			sb.append(")");
		}
	}
	
	static boolean isUniform(int n, int rStart, int cStart) {
		for (int i = rStart; i < rStart + n; i++) {
			for (int j = cStart; j < cStart + n; j++) {
				if (board[i][j] != board[rStart][cStart]) {
					return false;
				}
			}
		}
		return true;
	}
}
