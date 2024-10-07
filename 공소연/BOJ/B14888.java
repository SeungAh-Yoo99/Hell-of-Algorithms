// 문제 링크: https://www.acmicpc.net/problem/14888
// 시간: 76ms
// 메모리: 13224KB

import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] nums;
    static int[] operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backtrack(1, nums[0], false);

        System.out.println(max);
        System.out.println(min);
    }

    static void backtrack(int depth, int cal, boolean minus) {
        if (depth == n) {
            max = Math.max(max, minus ? -1 * cal : cal);
            min = Math.min(min, minus ? -1 * cal : cal);
            return;
        }

        if (operator[0] > 0) {
            operator[0]--;
            backtrack(depth + 1, cal + nums[depth], minus);
            operator[0]++;
        }
        if (operator[1] > 0) {
            operator[1]--;
            backtrack(depth + 1, cal - nums[depth], minus);
            operator[1]++;
        }
        if (operator[2] > 0) {
            operator[2]--;
            backtrack(depth + 1, cal * nums[depth], minus);
            operator[2]++;
        }
        if (operator[3] > 0) {
            operator[3]--;
            backtrack(depth + 1, cal / Math.abs(nums[depth]), nums[depth] < 0);
            operator[3]++;
        }
    }
}
