//문제링크 https://www.acmicpc.net/problem/11053
//시간 120ms
//메모리 15272KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] seq = new int[num];
        int[] dp = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < num; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < num; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
