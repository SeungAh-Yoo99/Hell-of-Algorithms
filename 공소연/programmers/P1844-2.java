// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
// 시간: 0.24ms
// 메모리: 73.5MB

import java.util.*;

class Solution {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int min = Integer.MAX_VALUE;
    int[][] _maps;
    int[] cur; int r; int c; int nx; int ny; int count = 0;
    
    public int solution(int[][] maps) {
        r = maps.length;
        c = maps[0].length;
        _maps = maps;
        
        return bfs(0, 0);
    }
    
    int bfs(int x, int y) {        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[r][c];
        q.add(new int[] {x, y, 1});
        visited[y][x] = true;

        while (!q.isEmpty()) {
            cur = q.poll();
            x = cur[0];
            y = cur[1];
            count = cur[2];
            
            if (x == c - 1 && y == r - 1) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= c || ny >= r) {
                    continue;
                }
                if (!visited[ny][nx] && _maps[ny][nx] == 1) {
                    q.add(new int[] {nx, ny, count + 1});
                    visited[ny][nx] = true;
                }
            }
        }
        return -1;
    }
}
