//문제 링크 https://www.acmicpc.net/problem/11047
//시간 104ms
//메모리 14320KB 


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numN = Integer.parseInt(st.nextToken());  
        int numK = Integer.parseInt(st.nextToken());  
        int[] coins = new int[numN];  
        
        for (int i = 0; i < numN; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = numN-1; i >= 0; i--) {
            if (numK / coins[i] > 0) {
                count += (numK/coins[i]);
                numK -= (numK/coins[i])*coins[i];
            }
        }
        System.out.print(count);
    }
}
