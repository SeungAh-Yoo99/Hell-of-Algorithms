package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1931
// 시간: 500 ms
// 메모리: 46308 KB

import java.io.*;
import java.util.*;

public class B1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int time = 0;
        int cnt = 0;

        for(int i=0; i<N; i++) {
            if(time > arr[i][0]) continue;
            time = arr[i][1];
            cnt ++;
        }

        System.out.println(cnt);
    }
}
