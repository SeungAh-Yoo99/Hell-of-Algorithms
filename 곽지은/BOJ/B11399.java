//문제링크 : https://www.acmicpc.net/problem/11399
//시간 : 104ms
//메모리 : 14440KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum = 0;  
        int item = 0;  
        for (int i = 0; i < n; i++) {
            item += arr[i];
            sum += item;
        }
        System.out.print(sum);
    }
}
