//문제 링크: https://www.acmicpc.net/problem/2018
//시간: 120 ms
//메모리: 11540 KB

import java.io.*;

public class boj2018 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		
		int start = 1;
		int end = 1;
		int cnt = 1;
		int sum = 1;
		
		while(start < N) {
			// 일치하면 cnt 증가
			if(sum == N) {
				cnt++; 
			}
			
			// 작으면 1. 먼저 끝나는 지점을 증가 2. sum에 합계 누적
			if(sum < N) {
				end++;
				sum += end;
				continue;
			}
			
			// 같거나 크면 1. 먼저 sum에 시작점을 빼고 2. 시작점 증가 
			if(sum >= N) {
				sum -= start;
				start++;
			}
		}
		System.out.println(cnt);
	}

}
