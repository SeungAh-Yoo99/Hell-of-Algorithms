package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1303
// 시간: 76 ms
// 메모리: 12664 KB

import java.io.*;
import java.util.*;

public class B1303 {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[row][col]; // 전쟁터
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String input = br.readLine();
            for (int j = 0; j < col; j++) if (input.charAt(j) == 'B') arr[i][j] = true;
        }

        int x = 0; // 아군 위력의 합
        int y = 0; // 적군 위력의 합

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j]) continue;

                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[] {i, j, 1});
                boolean value = arr[i][j];
                visited[i][j] = true;
                int cnt = 1;

                while (!queue.isEmpty()) {
                    int[] now = queue.poll();
                    for (int d = 0; d < 4; d++) {
                        int r = now[0] + dy[d];
                        int c = now[1] + dx[d];
                        if (r >= 0
                                && c >= 0
                                && r < row
                                && c < col
                                && value == arr[r][c]
                                && !visited[r][c]) {
                            queue.add(new int[] {r, c, now[2] + 1});
                            visited[r][c] = true;
                            cnt++;
                        }
                    }
                }

                if (value) y += (cnt * cnt);
                else x += (cnt * cnt);
            }
        }

        System.out.println(x + " " + y);
    }
}
