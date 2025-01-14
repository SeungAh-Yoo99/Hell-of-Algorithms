//문제 링크: https://www.acmicpc.net/problem/1920
//시간: 448 ms
//메모리: 59540 MB

import java.io.*;
import java.util.*;

public class boj1920 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<M; j++) {
			sb.append(set.contains(Integer.parseInt(st.nextToken())) ? "1" : "0").append("\n");
			
		}
		System.out.println(sb);
	}

}
