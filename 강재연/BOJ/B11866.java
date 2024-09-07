// 문제 링크: https://www.acmicpc.net/problem/11866
// 시간: 136 ms
// 메모리: 23132 KB

import java.util.*;
import java.io.*;

public class boj11866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 순서대로 큐에 입력 (1~N)
		for(int i=1; i<N+1; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		
		while(!queue.isEmpty()) {
			// K번째 사람을 제거해야하니까 K-1번까지 큐에서 뽑은 다음 다시 큐에 입력 
			for(int j=0; j<K-1; j++) {
				queue.add(queue.remove());
			}
			// K번째 사람을 뽑음과 동시에 sb에 append 
			sb.append(queue.remove()).append(", ");
		}
		// 마지막 ", " 문자열 제거
		sb.delete(sb.length() -2 , sb.length());
		sb.append(">");
		
		System.out.println(sb);
	}

}
