//문제 링크: https://www.acmicpc.net/problem/17413
//시간: 120 ms
//메모리: 15824 KB

import java.io.*;

public class boj17413 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
				
		boolean flag = false;
		for (char ch:br.readLine().toCharArray()) {
			if(ch=='<') {
				// < 태그 시작시 이전에 sb에 누적된 값 reverse 하고 append
				result.append(sb.reverse());
				// > 태그가 나올때까지 flag true
				flag = true;
				result.append(ch);
				continue;
			}
						
			if(ch=='>') {
				// > 태그 나오면 flag false
				flag=false;
				result.append(ch);
				// sb 초기화 
				sb = new StringBuilder();
				continue;
			}
			
			
			if(flag) {
				// <> 사이에 있는 ch는 그대로 출력
				result.append(ch);
			}else {
				if(ch == ' ') {
					// 공백이면
					// 이전까지 sb에 담았던 값을 reverse해서 result에 append
					result.append(sb.reverse());
					result.append(ch);
					// sb 초기화
					sb = new StringBuilder();
				}else {
					// 공백이 아닌경우 sb에 누적
					sb.append(ch);
				}
			}
		}
		// 맨 마지막 음절 뒤집음 
		result.append(sb.reverse());
		
		System.out.println(result);
	}

}
