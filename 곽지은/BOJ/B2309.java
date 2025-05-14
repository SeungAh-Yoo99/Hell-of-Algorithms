//문제 링크 https://www.acmicpc.net/problem/2309
//시간 104ms
//메모리 14212KB


import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = new int[9];
    static int sum = 0;
    static int fake1 = 0, fake2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = arr[i];
                    fake2 = arr[j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if(fake1 == arr[i] || fake2 == arr[i]) continue;
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
