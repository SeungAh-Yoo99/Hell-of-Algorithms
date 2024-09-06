// 문제 링크: https://www.acmicpc.net/problem/17608
// 시간: 248 ms
// 메모리: 25780 KB

package structure;

import java.io.*;
import java.util.*;

public class boj17608 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		
		// 가장 바깥에 있는 막대기를 기준으로 삼음
		int standard = stack.pop();
		int cnt = 1;
		
		// 스택이 전부 비워질 때까지 반복
		while(!stack.isEmpty()) {
			// 스택에서 한개씩 뽑아서 비교
			int out = stack.pop();
			// 뽑은게 막대기보다 크면
			if(out > standard) {
				// 기준이 될 막대기를 바꾸고
				standard = out;
				// 보이는 갯수도 증가
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
