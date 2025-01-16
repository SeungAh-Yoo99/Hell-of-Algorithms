package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/7576
// 시간: 592 ms
// 메모리: 252148 KB

import java.util.*;
import java.io.*;

public class B7576 {
    static int rowCnt; // 행의 길이
    static int colCnt; // 열의 길이
    static int[][] box; // 토마토 상자
    static List<int[]> start; // 시작하는 노드 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        colCnt = Integer.parseInt(st.nextToken());
        rowCnt = Integer.parseInt(st.nextToken());
        box = new int[rowCnt][colCnt];
        start = new ArrayList<>();

        for (int i = 0; i < rowCnt; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < colCnt; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) start.add(new int[]{i, j});
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        for (int[] node : start) queue.add(new int[]{node[0], node[1], 0}); // 시작 노드들 먼저 큐에 삽입
        int max = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); // 현재 노드
            max = Math.max(max, cur[2]);

            int[][] dir = {{cur[0] + 1, cur[1]}, {cur[0] - 1, cur[1]}, {cur[0], cur[1] + 1}, {cur[0], cur[1] - 1}};
            for (int[] d : dir) {
                if (d[0] >= 0 && d[1] >= 0 && d[0] < rowCnt && d[1] < colCnt && box[d[0]][d[1]] == 0) {
                    box[d[0]][d[1]] = 1;
                    queue.add(new int[]{d[0], d[1], cur[2] + 1});
                }
            }
        }

        // 모든 토마토가 익었는지 확인
        for (int[] cols : box) {
            for (int value : cols) {
                if (value == 0) {
                    max = -1;
                    break;
                }
            }
        }

        System.out.println(max);
    }
}
