//문제 링크: https://www.acmicpc.net/problem/1764
//시간: 364 ms
//메모리: 32888 KB

import java.io.*;
import java.util.*;

public class boj1764 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 듣도 못한 사람을 set에 입력
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(br.readLine());
		}
		
		// 보도 못한 사람의 이름이 set에 이미 존재하면 듣보잡에 추가  
		ArrayList<String> keys = new ArrayList<>(); 
		for(int j=0; j<M; j++) {
			String people = br.readLine();
			if(!set.contains(people)) set.add(people);
			else keys.add(people);
		}

		StringBuilder sb = new StringBuilder();
		sb.append(keys.size()).append("\n");
		
		// 사전순 정렬
		keys.sort((k1, k2) -> k1.compareTo(k2));
		for(String key : keys) sb.append(key).append("\n");
		System.out.println(sb);
	}

}
