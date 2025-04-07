/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120866
 * 시간: 4.21ms
 * 메모리: 86.4MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P120866 {
    public int solution(int[][] board) {
        // 1의 위치: 2차 배열로
        int n = board.length;
        int m = board[0].length;
        List<int[]> oneBoard = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    oneBoard.add(new int[]{i, j});
                }
            }
        }

        // 8방 탐색: 위험지역 표시
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int[] pos : oneBoard) {
            int x = pos[0];
            int y = pos[1];

            for (int d = 0; d < 8; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >=0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                }
            }
        }

        // 안전지역 개수 return
        return (int) Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .filter(b -> b == 0)
                .count();
    }
}
