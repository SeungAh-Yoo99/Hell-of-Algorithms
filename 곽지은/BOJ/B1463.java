//문제링크 https://www.acmicpc.net/problem/1463
//시간 128ms
//메모리 18044KB


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numN = Integer.parseInt(br.readLine());
        
        int[] dp = new int[numN + 1];

        dp[0] = 0; 
        if (numN >= 1) {
            dp[1] = 0; 
        }
        for (int i = 2; i <= numN; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[numN]);
    }
}
