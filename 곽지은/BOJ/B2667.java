//문제링크 https://www.acmicpc.net/problem/2667
//시간 116ms
//메모리 14316KB

import java.io.*;
import java.util.*;

public class Main {
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int[] aparts = new int[25 * 25];
    static int n;
    static int apartNum = 0;
    static boolean[][] visited = new boolean[25][25];
    static int[][] map = new int[25][25];
    
    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});
        visited[x][y] = true;
        aparts[apartNum]++;

        while (!que.isEmpty()) {
            int curX = que.peek()[0];
            int curY = que.peek()[1];
            que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        que.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        aparts[apartNum]++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartNum++;
                    bfs(i, j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] != 0) {
                System.out.println(aparts[i]);
            }
        }
    }
}
