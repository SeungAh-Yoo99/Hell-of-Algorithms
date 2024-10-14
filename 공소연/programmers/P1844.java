// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
// 시간: 0.55msms
// 메모리: 73.5MB

class Solution {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int min = Integer.MAX_VALUE;
    boolean[][] visited;
    int[][] _maps;
    int r; int c; int nx; int ny;
    
    public int solution(int[][] maps) {
        r = maps.length;
        c = maps[0].length;
        _maps = maps;
        visited = new boolean[r][c];
        
        dfs(0, 0, 1);
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    void dfs(int x, int y, int count) {        
        if (x == c - 1 && y == r - 1) {
            min = Math.min(min, count);
            return;
        }
        
        visited[y][x] = true;
                
        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= c || ny >= r) {
                continue;
            }
            if (!visited[ny][nx] && _maps[ny][nx] == 1) {
                dfs(nx, ny, count + 1);
            }
        }
        
        visited[y][x] = false;
    }
}
