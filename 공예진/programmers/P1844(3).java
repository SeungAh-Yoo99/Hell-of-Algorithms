//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
//시간: 0.56ms
//메모리: 83.5MB

import java.util.*;

class Point {
    public int x;
    public int y ;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    static int n;
    static int m;
    static int[][] maps;
    static boolean[][] visited;

    //         좌  우  상  하
    int[] X = {-1, 1, 0, 0};
    int[] Y = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        // 상대방 진영 위치 (n, m)
        n = maps.length - 1;
        m = maps[0].length - 1;
        this.maps = maps;
        visited = new boolean[n + 1][m + 1];

        bfs(0, 0);
        return visited[n][m] ? maps[n][m] : -1;
    }

    public void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < X.length; i++) {
                int nx = point.x + X[i];
                int ny = point.y + Y[i];

                if (nx <= n && ny <= m && nx >= 0 && ny >= 0 && !visited[nx][ny] && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[point.x][point.y] + 1;
                    queue.add(new Point(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}