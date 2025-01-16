//문제 링크 https://www.acmicpc.net/problem/1260
//시간 220ms
//메모리 23308KB


import java.io.*;
import java.util.*;

public class Main {

	static boolean[] check;
	static int[][] arr;
	static int node, line, start;
	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		arr = new int[node + 1][node + 1];
		check = new boolean[node + 1];

		for (int i = 0; i < line; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());

			arr[a][b] = arr[b][a] = 1;
		}

		StringBuilder sb = new StringBuilder();
		dfs(start, sb);
		sb.append("\n");
		check = new boolean[node + 1];

		bfs(start, sb);

		System.out.println(sb);
	}

	public static void dfs(int start, StringBuilder sb) {
		check[start] = true;
		sb.append(start).append(" ");

		for (int i = 0; i <= node; i++) {
			if (arr[start][i] == 1 && !check[i])
				dfs(i, sb);
		}
	}

	public static void bfs(int start, StringBuilder sb) {
		queue.add(start);
		check[start] = true;

		while (!queue.isEmpty()) {
			start = queue.poll();
			sb.append(start).append(" ");

			for (int i = 1; i <= node; i++) {
				if (arr[start][i] == 1 && !check[i]) {
					queue.add(i);
					check[i] = true;
				}
			}
		}
	}
}
