//문제링크 https://www.acmicpc.net/problem/12865
//시간 272ms
//메모리 94560KB


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[] weight;
    static int[] value;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numN = Integer.parseInt(st.nextToken());
        int numK = Integer.parseInt(st.nextToken());

        weight = new int[numN];
        value = new int[numN];
        dp = new Integer[numN][numK + 1];

        for (int i = 0; i < numN; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapSack(numN - 1, numK));
    }

    static int knapSack(int i, int k) {
        if (i < 0)
            return 0;

        if (dp[i][k] == null) {
            if (weight[i] > k) {
                dp[i][k] = knapSack(i - 1, k);
            } else {
                dp[i][k] = Math.max(knapSack(i - 1, k), knapSack(i - 1, k - weight[i]) + value[i]);
            }
        }

        return dp[i][k];
    }
}
