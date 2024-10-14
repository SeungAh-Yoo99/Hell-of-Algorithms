//문제 링크: https://www.acmicpc.net/problem/17219
//시간: 556 ms
//메모리: 57524 KB

import java.io.*;
import java.util.*;

public class boj17219 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> password = new HashMap<>();
		
		// N개만큼 사이트명을 key에 비밀번호를 value에 넣음
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			password.put(st.nextToken(), st.nextToken());
		}
		
		// M개만큼 주어진 사이트명에서 비밀번호 value값을 get하고 출력
		for(int j=0; j<M; j++) {
			sb.append(password.get(br.readLine())).append("\n");
		}
		
		System.out.println(sb);
	}

}
