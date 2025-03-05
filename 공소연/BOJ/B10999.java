// 링크: https://www.acmicpc.net/problem/10999
// 시간: 652ms
// 메모리: 148856KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long[] tree, arr, lazy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수의 개수
        int m = Integer.parseInt(st.nextToken()); // 수의 변경이 일어나는 횟수
        int k = Integer.parseInt(st.nextToken()); // 구간의 합을 구하는 횟수

        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        tree = new long[4 * n];
        lazy = new long[4 * n];

        init(0, n - 1, 1);

        for (int i = 0; i < m + k; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken()); // 서수라서 int
            int c =Integer.parseInt(st.nextToken()); // 서수라서 int
            if (a.equals("1")) { // a가 1인 경우 b번째 수부터 c번째 수에 d를 더하고
                long d = Long.parseLong(st.nextToken()); // 실제 더하는 수이므로 long
                replace(0, n - 1,b - 1, c - 1, d, 1);
            }
            if (a.equals("2")) { // a가 2인 경우에는 b번째 수부터 c번째 수의 합을 구하기
                sb.append(sum(0, n - 1, b - 1, (int) c - 1, 1)).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static void propagate(int node, int start, int end) {
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];
            if (start != end) { // 리프 노드가 아니면
                lazy[node * 2] += lazy[node];
                lazy[node * 2 + 1] += lazy[node];
            }
            lazy[node] = 0;
        }
    }

    private static void replace(int start, int end, int left, int right, long diff, int node) {
        propagate(node, start, end);

        if (left > end || right < start) return;
        if (left <= start && end <= right) { // 리프 노드까지 내려가지 않고 lazy에 저장
            tree[node] += (end - start + 1) * diff;
            if (start != end) {
                lazy[node * 2] += diff;
                lazy[node * 2 + 1] += diff;
            }
            return;
        }

        int mid = (start + end) / 2;
        replace(start, mid, left, right, diff, node * 2);
        replace(mid + 1, end, left, right, diff, node * 2 + 1);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    private static long sum(int start, int end, int left, int right, int node) {
        propagate(node, start, end);

        if (left > end || right < start) return 0;
        if (left <= start && end <= right) return tree[node];
        int mid = (start + end) / 2;
        return sum(start, mid, left, right, node * 2) + sum(mid + 1, end, left, right, node * 2 + 1);
    }

    static long init(int start, int end, int node) {
        if (start == end) return tree[node] = arr[start];
        int mid = (start + end) / 2;
        return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
    }
}
