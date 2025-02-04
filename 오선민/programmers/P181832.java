/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181832
 * 시간: 0.09ms
 * 메모리: 82.6MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P181832 {
    public int[][] solution(int n) {
        int[][] array = new int[n][n];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int direction = 0, x = 0, y = 0;

        for (int i = 1; i <= n * n; i++) {
            array[x][y] = i;
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || array[nx][ny] != 0) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        return array;
    }
}
