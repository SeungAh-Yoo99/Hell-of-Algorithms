//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
//시간: 0.74ms
//메모리: 71.3KB

class Solution {
    int[] X= {0, 0, 1, -1};
    int[] Y= {1, -1, 0, 0};
    int[][] gMaps;
    boolean[][] visited;
    int min = 10000;
    int endX;
    int endY;

    public int solution(int[][] maps) {
        int answer = 0;
        gMaps = maps;
        visited = new boolean [maps.length][maps[0].length];
        endX = maps.length -1;
        endY = maps[0].length -1;

        // 시작점에서 count 1로 시작 (자기 자신 포함)
        dfs(0, 0, 1);

        answer = (min == 10000 ? -1 : min);
        return answer;
    }

    void dfs(int x, int y, int count) {
        // 범위를 벗어나거나 이미 방문한 경우, 또는 이동할 수 없는 칸인 경우 리턴
        if(x < 0 || y < 0 || x > endX || y > endY || visited[x][y] == true || gMaps[x][y] == 0 ) {
            return;
        }

        // 도착 지점에 도달한 경우
        if (x == endX && y == endY) {
            min = Math.min(min, count);
            return;
        }

        // 현재 위치 방문 처리
        visited[x][y] = true;

        // 상하좌우로 DFS 탐색
        for (int i = 0; i < X.length; i++) {
            dfs(x+X[i], y+Y[i], count + 1);
        }

        // 탐색 후에는 방문 기록을 해제 (백트래킹)
        visited[x][y] = false;

    }
}