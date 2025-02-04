/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120860
 * 시간: 0.05 ms
 * 메모리: 75.4 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.lang.Math;

public class P120860 {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < 4; i++) {
            if (dots[i][0] > x) {
                x = dots[i][0] - x;
                break;
            } else if (x > dots[i][0]) {
                x -= dots[i][0];
                break;
            }
        }

        for (int i = 1; i < 4; i++) {
            if (dots[i][1] > y) {
                y = dots[i][1] - y;
                break;
            } else if (y > dots[i][1]) {
                y -= dots[i][1];
                break;
            }
        }

        return Math.abs(x*y);
    }
}
