package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/5639
// 시간: 396 ms
// 메모리: 30356 KB

import java.io.*;

public class B5639 {
    private static void postOrder(int[] arr, int start, int end) {
        if (start > end) return;

        int root = arr[start];
        int mid = start + 1;

        while (mid <= end && arr[mid] < root) mid++; // 인덱스

        postOrder(arr, start + 1, mid - 1); // 왼쪽 서브트리
        postOrder(arr, mid, end); // 오른쪽 서브트리

        System.out.println(root); // root 출력
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10000]; // 전위 순회 결과

        int cnt = 0;
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) arr[cnt++] = Integer.parseInt(input);

        postOrder(arr, 0, cnt - 1); // 후위 순회
    }
}
