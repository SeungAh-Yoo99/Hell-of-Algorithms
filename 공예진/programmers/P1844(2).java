//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
//시간: 0.47ms
//메모리: 72.6MB

import java.util.*;

/**
 * 리팩토링한 부분 : dfs -> bfs로 변경 (효율성 테스트 통과)
 */

class Point {
    public int x, y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int[] X= {0, 0, 1, -1};
    int[] Y= {1, -1, 0, 0};
    int[][] gMaps;
    int[][] visited; // 최단거리를 저장하기 위해 int 배열 사용
    int endX;
    int endY;

    public int solution(int[][] maps) {
        int answer = 0;
        gMaps = maps;
        visited = new int [maps.length][maps[0].length];
        endX = maps.length -1;
        endY = maps[0].length -1;

        bfs(0, 0);
        // 도착지점의 거리를 반환
        return visited[endX][endY] == 0 ? -1 : visited[endX][endY];
    }

    void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        Point point = new Point(x, y);
        queue.add(point);
        visited[x][y] = 1;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            // 상하좌우 체크
            for (int i = 0; i < X.length; i++) {
                int nx = p.x + X[i];
                int ny = p.y + Y[i];

                // 방문이 가능하면
                if (nx >= 0 && ny >= 0 && nx <= endX && ny <= endY && visited[nx][ny] == 0 && gMaps[nx][ny] == 1) {
                    visited[nx][ny] = visited[p.x][p.y] + 1; // 이전 값에 1을 더한 값으로 변경
                    queue.add(new Point(nx, ny)); // queue에 좌표를 넣고 다시 while문으로 돌아감
                }
            }
        }
    }
}