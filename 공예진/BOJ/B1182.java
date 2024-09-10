//문제 링크: https://www.acmicpc.net/problem/1182
//시간: 116ms
//메모리: 14456KB

import java.util.*;
import java.io.*;

public class Main {
    static int N; // N개의 정수
    static int S; // 원소를 다 더한 값
    static List<Integer> intList;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        S = Integer.parseInt(arr[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        intList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }

        backtracking(0, 0);
        System.out.println(S == 0 ? cnt - 1 : cnt); // 한 번도 더하지 않는 경우를 빼준다.
    }

    public static void backtracking (int index, int sum) {
        if (index == N) {
            if (sum == S) { // 리프 노드까지 백트래킹 했을 때, sum이 S이면 cnt 증가
                cnt++;
            }
            return;
        }

        backtracking(index + 1, sum); // 더하지 않는 경우
        backtracking(index + 1, sum + intList.get(index)); // 더하는 경우
    }
}
