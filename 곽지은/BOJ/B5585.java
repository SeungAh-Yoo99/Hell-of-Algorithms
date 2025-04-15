//문제 링크 https://www.acmicpc.net/problem/5585
//시간 100ms
//메모리 14088KB


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int[] coinArr = {500, 100, 50, 10, 5, 1};
        int change = 1000 - cost;
        int num = 0;

        for (int coin : coinArr) {
            num += change / coin;
            change %= coin;
        }
        System.out.println(num);
    }
}
