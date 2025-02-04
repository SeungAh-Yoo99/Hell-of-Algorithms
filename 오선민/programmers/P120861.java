/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120861
 * 시간: 0.07 ms
 * 메모리: 71.9 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.lang.Math;

public class P120861 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int x = 0, y = 0, nx = 0, ny = 0;

        for (String dir : keyinput) {
            if (dir.equals("up")) {
                nx = dx[0];
                ny = dy[0];
            } else if (dir.equals("down")) {
                nx = dx[1];
                ny = dy[1];
            } else if (dir.equals("left")) {
                nx = dx[2];
                ny = dy[2];
            } else if (dir.equals("right")) {
                nx = dx[3];
                ny = dy[3];
            }

            if (Math.abs(x+nx) > board[0]/2 || Math.abs(y+ny) > board[1]/2) {
                continue;
            }

            x += nx;
            y += ny;
        }
        return new int[] {x, y};
    }
}
