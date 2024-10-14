// 문제 링크: https://www.acmicpc.net/problem/2161
// 시간: 104 ms
// 메모리: 14416 KB

import java.util.*;
import java.io.*;

public class boj2161 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<N+1; i++) {
			queue.add(i);
		}
		
		// 큐가 비워질 때 까지 반복
		while(!queue.isEmpty()) {
			// 맨 위의 카드를 버린다 
			sb.append(queue.remove()).append(" ");
			
			// 여기서 큐가 전부 비워졌다면 while문에서 빠져나감 
			if(queue.isEmpty()) continue;
			
			// 아니라면 그 다음 카드를 밑으로 옮긴다
			queue.add(queue.remove());
		}
		// 마지막 공백 제거
		sb.delete(sb.length() -1, sb.length());
		System.out.println(sb);
	}

}
