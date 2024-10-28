//문제링크 https://www.acmicpc.net/problem/9095
//시간 108ms
//메모리 14180KB


import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numN = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		for(int i=0; i<numN; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(dp[num]);
		}
	}
}
