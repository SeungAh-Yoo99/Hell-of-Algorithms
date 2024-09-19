// 문제 링크: https://www.acmicpc.net/problem/10162
// 시간: 64 ms
// 메모리: 11532 KB

import java.io.*;

public class boj10162 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		int[] times = {300, 60, 10};
		
		for(int time : times) {
			// 몫이 있을 경우에 sb.append 
			if(T / time > 0) {
				sb.append(T/time);
				T %= time;
			}else {
				sb.append("0");
			}
			sb.append(" ");
		}
		if(T != 0) {
			// 정확히 나눠 떨어지지 않으면 -1 출력
			System.out.println("-1");
		}else {
			System.out.println(sb);			
		}

	}

}
