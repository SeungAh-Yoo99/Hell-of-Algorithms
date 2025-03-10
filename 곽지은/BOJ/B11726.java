//문제 링크  https://www.acmicpc.net/problem/11726
//시간 104ms
//메모리 14380KB


import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numN = Integer.parseInt(br.readLine());
		if (numN == 0) {
			System.out.println(1);
			return;
		}

		int[] dp = new int[numN + 1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= numN; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		System.out.println(dp[numN]);
	}
}
