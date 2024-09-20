//문제 링크: https://www.acmicpc.net/problem/1996
//시간: 100 ms
//메모리: 13440 KB

import java.util.*;
import java.io.*;

public class boj1996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 총 테스트 케이스 갯수
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		// 테스트 케이스만큼 반복
		for(int i=0; i<T; i++) {
			// 테스트 케이스별 N과 M을 읽어올 첫번째줄 
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			
			// 실질적인 인쇄 순서를 결정할 두번째줄 입력 처리 
			st = new StringTokenizer(br.readLine());
			
			Queue<Integer> queue = new LinkedList<>();
			
			// queue에 입력처리 
			while(st.hasMoreTokens()) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			
			// M번째 문서의 출력 순서
			int turn = 0; 
			
			// 실질적인 로직 
			while(true) {
				// 1. 큐의 가장 최근값이 maximum 값이 아닌 경우
				if(queue.peek() != Collections.max(queue)) {
					// 3. maximum 값이 아닌데 M이 0인경우
					if(M == 0) {
						// 현재 queue의 사이즈만큼 재할당
						M = queue.size();
					}
					// 2. 최근값을 제거하고 맨 뒤로 다시 추가 
					queue.add(queue.remove());
				}else {
					// maximum 값인 경우 queue에서 제거
					queue.remove();
					
					// 출력된 순서 증가
					turn++;
					
					// 해당 인쇄물이 처음에 알고자 했던 M번째 문서라면
					if(M == 0) {
						// 몇번째로 출력된건지 turn값 출력
						sb.append(turn).append("\n");
						// while문 벗어남
						break;
					}
				}
				// 반복문이 돌아갈때마다 M 감소 
				M--;
			}			
		}
		System.out.println(sb);
	}
}
