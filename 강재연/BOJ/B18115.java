//문제 링크: https://www.acmicpc.net/problem/18115
//시간: 636 ms
//메모리: 216976 KB

import java.io.*;
import java.util.*;

public class boj18115 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();
		// [검색] 입력을 역순으로 받으면 카드 순서를 처리하는게 편해진다고합니다... 
		// 그런데 굳이 또 스텍을 쓰고싶진 않아서 StringBuilder.reverse() 
		StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
		
		for(int i=1; i<=N; i++) {
			// 1, 2, 3번 기술에 따라 카드를 내려놓는 순서가 달라짐
			switch (Integer.parseInt(st.nextToken())) {
				case 1:
					deque.addFirst(i);
					break;
				case 2:
					// 위에서 두번째 카드를 내려놓는다
					// -> 첫번째 카드를 빼고 두번째를 넣은뒤 첫번째를 다시 삽입
					int remove = deque.removeFirst();
					deque.addFirst(i);
					deque.addFirst(remove);
					break;
				case 3:
					deque.addLast(i);
					break;
				}
		}
		
		StringBuilder sb = new StringBuilder();
		// 출력 
		while(!deque.isEmpty()) {
			sb.append(deque.remove()).append(" ");
		}
		System.out.println(sb);
	}

}
