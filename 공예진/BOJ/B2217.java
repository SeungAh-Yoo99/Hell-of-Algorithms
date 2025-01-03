//문제 링크: https://www.acmicpc.net/problem/2217
//시간: 252ms
//메모리: 26400KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] *= (N - i);
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}
