package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/16507
// 시간: 468 ms
// 메모리: 91128 KB

import java.io.*;
import java.util.StringTokenizer;

public class B16507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()); // 행의 크기
        int C = Integer.parseInt(st.nextToken()); // 열의 크기
        int Q = Integer.parseInt(st.nextToken()); // 테스트 개수

        int[][] arr = new int[R + 1][C + 1]; // 직사각형 밝기 배열
        for (int i = 1; i <= R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= C; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] sum = new int[R + 1][C + 1]; // 밝기 누적합 배열
        sum[1][1] = arr[1][1];
        for (int i = 2; i <= R; i++) sum[i][1] = arr[i][1] + sum[i - 1][1];
        for (int i = 2; i <= C; i++) sum[1][i] = arr[1][i] + sum[1][i - 1];
        for (int i = 2; i <= R; i++) {
            for (int j = 2; j <= C; j++) // 현재 밝기 + 윗 부분 누적 밝기 + 왼쪽 부분 누적 밝기 - 겹치는 부분
                sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int startRow = Integer.parseInt(st.nextToken());
            int startCol = Integer.parseInt(st.nextToken());
            int endRow = Integer.parseInt(st.nextToken());
            int endCol = Integer.parseInt(st.nextToken());

            sb.append( // 누적합으로 표현된 밝기 구하는 법 -> 평균을 구하기 위해 나눗셈
                    (sum[endRow][endCol]
                                            - sum[startRow - 1][endCol]
                                            - sum[endRow][startCol - 1]
                                            + sum[startRow - 1][startCol - 1])
                                    / ((endRow - startRow + 1) * (endCol - startCol + 1))
                            + "\n");
        }

        bw.append(sb.toString());
        bw.close();
    }
}
