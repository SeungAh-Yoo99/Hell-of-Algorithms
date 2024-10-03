package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2638
// 시간: 184 ms
// 메모리: 31744 KB

import java.io.*;
import java.util.*;

public class B2638 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열
        int[][] arr = new int[N][M]; // 전체 배엷
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int time = 0; // 걸리는 시간
        boolean flag = true;

        while (flag) {
            int[][] cnt = new int[N][M]; // 치즈가 외부 공기에 얼마나 유출됐는지 카운트하는 배열
            boolean[][] visited = new boolean[N][M];
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[] {0, 0});
            visited[0][0] = true;

            while (!queue.isEmpty()) {
                int[] target = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int r = target[0] + dy[k];
                    int c = target[1] + dx[k];
                    if (r >= 0 && c >= 0 && r < N && c < M && !visited[r][c]) { // 방문하지 않은 인덱스의 경우
                        if (arr[r][c] == 0) { // 치즈가 아닌 경우
                            queue.add(new int[] {r, c});
                            visited[r][c] = true;
                        } else { // 치즈인 경우
                            cnt[r][c]++;
                        }
                    }
                }
            }

            flag = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] == 1) {
                        if (cnt[i][j] >= 2) arr[i][j] = 0; // 공기 유출이 카운트 2이상인 경우 치즈 녹
                        flag = true;
                    }
                }
            }

            if (flag) time++;
        }

        System.out.println(time);
    }
}
