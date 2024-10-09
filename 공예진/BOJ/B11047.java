//문제 링크: https://www.acmicpc.net/problem/11047
//시간: 68ms
//메모리: 115602KB

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin <= K) {
                coins.add(coin);
            } else {
                break;
            }
        }

        int cnt = 0;
        for (int i = coins.size() - 1; i >= 0; i--) {
            int value = coins.get(i);
            cnt += K / value;
            K = K % value;
        }

        System.out.println(cnt);
    }
}
