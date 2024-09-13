// 문제 링크: https://www.acmicpc.net/problem/2018
// 시간: 200 ms
// 메모리: 11600 KB
  
import java.io.*;

public class boj2018 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int start = 1;
		int end = 1;
		int cnt = 0;
		
		while(start < N) {
			int sum = 0;
			for(int i=start; i<=end; i++) {
				sum += i;
				
				if(sum < N) {
					end++;
					continue;
				}
				
				if(sum > N) {
					start++;
					break;
				}
				
				if(sum == N) {
					start++;
					cnt ++; 
					break;
				}
			}
		}
		System.out.println(cnt+1);
	}

}
