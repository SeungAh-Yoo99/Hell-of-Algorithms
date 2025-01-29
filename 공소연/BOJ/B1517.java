// 링크: https://www.acmicpc.net/problem/1517
// 시간: 1536ms
// 메모리: 143700KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] tree;
    static int[] arr;
    static int[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tree = new int[4 * n];
        arr = new int[n];
        sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        // 좌표 압축
        Arrays.sort(sorted);
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rankMap.put(sorted[i], i);
        }

        long count = 0;
        for (int i = 0; i < n; i++) {
            int rank = rankMap.get(arr[i]);
            count += query(1, 0, n-1, rank + 1, n-1);
            update(1, 0, n-1, rank);
        }

        System.out.println(count);
    }

    // 세그먼트 트리를 업데이트 하는 함수
    // 1. start == end면 tree[node] += 1 해서 현재 num이 등장한 횟수 증가
    // 2. 그렇지 않으면 분할정복 if num <= mid: update(node*2, start, mid, num) else update(node*2 + 1, start, mid, num)
    // 3. 이후 결합 tree[node] = tree[node*2] + tree[node*2+1]
    static void update(int node, int start, int end, int idx) {
        if (start == end) {
            tree[node] += 1;
            return;
        }

        int mid = (start + end) / 2;
        if (idx <= mid) {
            update(node*2, start, mid, idx);
        } else {
            update(node*2+1, mid + 1, end, idx);
        }
        tree[node] = tree[node*2] + tree[node*2+1];
    }

    // 세그먼트 트리에서 num 보다 큰 수가 나온 횟수를 찾는 함수
    // 1. if 타겟 구간이 전체 구간을 커버: return tree[node]
    // 2. 분할정복 query(node*2, start, mid, left) + query(node*2+1, mid + 1, end, left)
    static int query(int node, int start, int end, int left, int right) {
        if (end < left || start > right) return 0;
        if (left <= start && end <= right) return tree[node];

        int mid = (start + end) / 2;
        return query(node*2, start, mid, left, right) +
                query(node*2+1, mid+1, end, left, right);
    }
}
