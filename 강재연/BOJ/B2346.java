//문제 링크: https://www.acmicpc.net/problem/2346
//시간: 120 ms
//메모리: 14752 KB

import java.io.*;
import java.util.*;

public class boj2346 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>(); // 풍선 종이 덱
		Deque<Integer> index = new ArrayDeque<>(); // 출력할 인덱스 덱
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			deque.add(Integer.parseInt(st.nextToken()));
			index.add(i+1);
		}
		
		StringBuilder sb = new StringBuilder();

		int poll = deque.poll();
		sb.append(index.poll()).append(" ");
		
		while(!deque.isEmpty()) {
			if(poll > 0) {
				// 풍선 종이가 양수일때
				for(int j=0; j<poll-1; j++) {
					// 앞에서 빼서 뒤로 넣음
					deque.addLast(deque.removeFirst());
					index.addLast(index.removeFirst());
				}
			}else {
				// 풍선 종이가 음수일때
				for(int k=poll; k<0; k++) {
					// 뒤에서 빼서 앞으로 넣음
					deque.addFirst(deque.removeLast());
					index.addFirst(index.removeLast());
				}
			}
			// 터지는 풍선 순서대로 인덱스 출력 
			sb.append(index.poll()).append(" ");
			// 실제 풍선 제거 
			poll = deque.poll();
		}
		
		System.out.println(sb);
	}

}
