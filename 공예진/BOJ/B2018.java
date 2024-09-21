//문제 링크: https://www.acmicpc.net/problem/2018
//시간: 264ms
//메모리: 53648KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        int cnt = 0;

        int start = 0;
        int end = 0;

        while (start < N) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            if (sum < N) {
                end += 1;
            } else if (sum > N) {
                start += 1;
            } else if (sum == N) {
                cnt++;
                start += 1;
            }
        }
        System.out.println(cnt);
    }

}