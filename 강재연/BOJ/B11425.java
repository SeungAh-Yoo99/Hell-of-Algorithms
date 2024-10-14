//문제 링크: https://www.acmicpc.net/problem/14425
//시간: 284 ms
//메모리: 38996 KB

import java.io.*;
import java.util.*;

public class boj14425 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			// N개만큼 map에 추가
			map.put(br.readLine(), 0);
		}
		
		int cnt = 0 ;
		for(int j=0; j<M; j++) {
			// M개만큼 반복하면서 해당 단어가 map의 키로 존재하면 cnt++ 
			if( map.get(br.readLine()) != null ) cnt ++;
		}
		
		System.out.println(cnt);
	}

}
