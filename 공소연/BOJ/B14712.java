// 문제 링크: https://www.acmicpc.net/problem/14712
// 시간: 248ms
// 메모리: 12612KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int count = 0;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new boolean[n + 1][m + 1];

        backtracking(1, 1);

        System.out.println(count);
    }

    static void backtracking(int r, int c) {
        // 배열 끝에 도달한 경우 종료
        if (r > n) {
            count++;
            return;
        }

        // 현재 열이 끝나면 다음 행으로 넘어가기
        int nextR = r;
        int nextC = c + 1;
        if (nextC > m) {
            nextR++;
            nextC = 1;
        }

        // 넴모를 놓지 않는 경우
        backtracking(nextR, nextC);

        // 넴모를 놓는 경우, 2x2를 형성하는지 체크
        if (r >= 2 && c >= 2 && arr[r-1][c] && arr[r][c-1] && arr[r-1][c-1]) {
            return; 
        }

        arr[r][c] = true;  // 넴모를 놓고
        backtracking(nextR, nextC);  // 다음 칸으로
        arr[r][c] = false;  // 원상 복구
    }
}
