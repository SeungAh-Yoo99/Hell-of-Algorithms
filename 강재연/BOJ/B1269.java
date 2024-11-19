//문제 링크: https://www.acmicpc.net/problem/1269
//시간: 684 ms
//메모리: 106912 KB

import java.io.*;
import java.util.*;

public class boj1269 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> A = new HashMap<>();
		HashMap<Integer, Integer> B = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num =Integer.parseInt(st.nextToken());
			A.put(num, A.getOrDefault(num, 0)+1);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int num =Integer.parseInt(st.nextToken());
			B.put(num, B.getOrDefault(num, 0)+1);
		}		
		
		int count = 0;
		for(int key:A.keySet()) {
			if(B.get(key) == null) count++;
		}
		
		for(int key:B.keySet()) {
			if(A.get(key) == null) count++;
		}
		System.out.println(count);
	}

}
