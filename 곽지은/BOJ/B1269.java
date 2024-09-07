// 문제 링크 https://www.acmicpc.net/problem/1269
// 시간 648ms
// 메모리 84148KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        for (int i : A) {
            if (!B.contains(i)) result++;
        }

        for (int i : B) {
            if (!A.contains(i)) result++;
        }

        System.out.println(result);
    }
}
