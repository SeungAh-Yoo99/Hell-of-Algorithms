//문제 링크: https://www.acmicpc.net/problem/3003
//시간: 64 ms
//메모리: 11556 KB

import java.io.*;
import java.util.*;

public class boj3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 비교해야하는 체스 피스
		int[] chess = {1,1,2,2,2,8};
		
		
		for(int i=0; i<chess.length; i++) {
			// 차이를 구해서 바로 sb.append() 
			sb.append(chess[i] - Integer.parseInt(st.nextToken())).append(" ");
		}
		System.out.println(sb);
	}

}
