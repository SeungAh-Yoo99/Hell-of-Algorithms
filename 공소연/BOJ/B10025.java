// 문제 링크: https://www.acmicpc.net/problem/10025
// 시간: 372ms
// 메모리: 63752KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int maxIdx = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 2 * K + 1;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ice = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            maxIdx = Math.max(maxIdx, idx);

            map.put(idx, ice);

            if (idx < right && idx >= left) answer += ice;
        }

        int sum = answer;
        while (right <= maxIdx) {
            sum -= map.getOrDefault(left, 0);
            sum += map.getOrDefault(right, 0);
            answer = Math.max(answer, sum);

            left++;
            right++;
        }

        System.out.println(answer);
    }
}
