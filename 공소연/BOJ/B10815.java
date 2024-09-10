// 문제 링크: https://www.acmicpc.net/problem/10815
// 시간: 900ms
// 메모리: 141332KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] ns = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ns[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ns);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int target;
        for (int i = 0; i < m; i++) {
            target = Integer.parseInt(st.nextToken());
            // 이분탐색 라이브러리 이용
            if (Arrays.binarySearch(ns, target) >= 0) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb.toString());
    }

    // 직접 구현
    static int binarySearch(int[] ns, int target) {
        int start = 0;
        int end = ns.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (ns[mid] > target) {
                // end를 더 작게
                end = mid - 1;
            } else if (ns[mid] < target) {
                // start를 더 크게
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
