//문제 링크: https://www.acmicpc.net/problem/11399
//시간: 112ms
//메모리: 14432KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int sum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            sum += arr[i] * (N - i);
        }

        System.out.println(sum);
    }

}
