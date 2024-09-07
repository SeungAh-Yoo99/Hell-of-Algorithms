// 문제 링크: https://www.acmicpc.net/problem/12605
// 시간: 108 ms
// 메모리: 14320 KB

import java.util.*;
import java.io.*;

public class boj12605 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			// 각 케이스별로 단어 갯수는 주어지지 않기 때문에 while로 반복함
			while(st.hasMoreTokens()) {
				stack.push(st.nextToken());
			}
			
			sb.append("Case #"+(i+1)+":");
			// 마찬가지로 각 케이스별로 stack이 전부 빌때까지 pop()을 반복
			while(!stack.isEmpty()) {
				sb.append(" ").append(stack.pop());
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}

