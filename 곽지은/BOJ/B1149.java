//문제 링크 https://www.acmicpc.net/problem/1149
//시간 112ms
//메모리 14676KB


import java.io.*;
import java.util.*;

public class Main {
	static int min = Integer.MAX_VALUE;
	static int[][] house;
	static int[][] color;
	static int num;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());
		
		house = new int[num][3];
		color = new int[num][3];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (st.hasMoreTokens()) {
				house[i][0] = Integer.parseInt(st.nextToken());
				house[i][1] = Integer.parseInt(st.nextToken());
				house[i][2] = Integer.parseInt(st.nextToken());
			}
		}
		
		color[0][0] = house[0][0];
		color[0][1] = house[0][1];
		color[0][2] = house[0][2];
		
		System.out.println(Math.min(Math.min(rgb(num - 1, 0), rgb(num - 1, 1)), rgb(num - 1, 2)));
	}

	public static int rgb(int num, int colorIndex) {
		if (color[num][colorIndex] == 0) {
			if (colorIndex == 0) 
				return color[num][colorIndex] = Math.min(rgb(num - 1, 1), rgb(num - 1, 2)) + house[num][colorIndex];
			if (colorIndex == 1) 
				return color[num][colorIndex] = Math.min(rgb(num - 1, 0), rgb(num - 1, 2)) + house[num][colorIndex];
			if (colorIndex == 2) 
				return color[num][colorIndex] = Math.min(rgb(num - 1, 0), rgb(num - 1, 1)) + house[num][colorIndex];
		}
		return color[num][colorIndex];
	}
}
