//문제링크 https://www.acmicpc.net/problem/1145
//시간 164ms
//메모리 19276KB


import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] arr = new int[5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        n = Arrays.stream(arr).min().getAsInt();
        while (true) {
            int count = 0;
            for (int num : arr) {
                if (n >= num && n % num == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
