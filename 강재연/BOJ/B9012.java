//문제 링크: https://www.acmicpc.net/problem/9012
//시간: 68 ms
//메모리: 11736 KB

import java.io.*;
import java.util.*;

public class boj9012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수 만큼 반복
		for(int i=0; i<T; i++) {
			// 테스트 케이스 별 stack 초기화
			Stack<Character> stack = new Stack<>();
			
			// char 타입으로 stack에 push
			for (char ch : br.readLine().toCharArray()) {
	            stack.push(ch);
	        }
			
			int left = 0;
			int right = 0;
			boolean flag = false; 
			
			while (!stack.isEmpty()) {
				// stack에서 하나 추출
				char pop = stack.pop();
				if(pop == '(') left ++;
				else if(pop == ')') right ++;
				
				// stack이기 때문에 )(을 쌍으로 비교해서 left가 right보다 많으면
				// 해당 테스트케이스 바로 종료 
				if(left > right) {
					sb.append("NO").append("\n");
					flag = true;
					break;
				}
	        }
			// while문 안에서 걸러지지 않았을 경우에만 비교 
			if(!flag) {
				if(left != right) sb.append("NO").append("\n");
				else if(left == right) sb.append("YES").append("\n");
			}
		}
		System.out.println(sb);
	}

}
