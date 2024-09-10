// 문제 링크: https://www.acmicpc.net/problem/10815
// 시간: 724ms
// 메모리: 173032KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int target;
        for (int i = 0; i < m; i++) {
            target = Integer.parseInt(st.nextToken());
            // HashSet으로 O(1)에 접근
            if (set.contains(target)) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb.toString());
    }
}
