// 링크: https://www.acmicpc.net/problem/2170
// 시간: 2372ms
// 메모리: 332616KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new int[] {start, end};
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int length = 0;
        int last = -1_000_000_000;
        for (int i = 0; i < n; i++) {
            int len;
            if (arr[i][0] > last) {
                len = arr[i][1] - arr[i][0];
            } else {
                if (arr[i][1] > last) {
                    len = arr[i][1] - last;
                } else {
                    len = 0;
                }
            }
            length += Math.abs(len);
            last = Math.max(arr[i][1], last);
        }

        System.out.println(length);
    }
}
