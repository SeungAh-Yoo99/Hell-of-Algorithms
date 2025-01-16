//문제 링크: https://www.acmicpc.net/problem/11651
//시간: 668 ms
//메모리: 72568 KB

import java.io.*;
import java.util.*; 

public class boj11651 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] coord = new int[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			coord[i][0] = Integer.parseInt(st.nextToken());
			coord[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 1. y좌표가 증가하는 순으로
		// 2. y좌표가 같으면 x좌표가 증가하는 순으로
		Arrays.sort(coord, (c1, c2) ->  c1[1] != c2[1] ? c1[1] - c2[1] : c1[0] - c2[0]);
		
		StringBuilder sb = new StringBuilder();
		for(int[] c : coord) sb.append(c[0]+" "+c[1]).append("\n");
		System.out.println(sb);
	}

}
