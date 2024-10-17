//문제 링크: https://www.acmicpc.net/problem/7785
//시간: 628 ms
//메모리: 51184 KB

import java.io.*;
import java.util.*;

public class boj7785 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			
			if(!set.contains(name)) {
				// set에 이름이 없으면 추가
				set.add(name);
			}else {
				// 이미 이름이 존재하면 삭제 
				set.remove(name);
			}
		}
		
		// set을 list로 변환해서 내림차순 정렬
		ArrayList<String> keys = new ArrayList<>(set);
		keys.sort((k1, k2) -> k2.compareTo(k1));
		
		StringBuilder sb = new StringBuilder();
		for(String key : keys) sb.append(key).append("\n");
		System.out.println(sb);
	}

}
