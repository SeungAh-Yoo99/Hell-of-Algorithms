// 문제 링크: https://www.acmicpc.net/problem/9093
// 시간: 312 ms
// 메모리: 49004 KB

import java.util.*;
import java.io.*;

public class boj9093 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 결과를 위한 StringBuilder 선언
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				// 각 음절마다 뒤집기 위해 StringBuilder 선언
				StringBuilder sb = new StringBuilder(st.nextToken());
				result.append(sb.reverse()).append(" ");
			}		
			result.append("\n");			
		}
		System.out.println(result);
	}

}
