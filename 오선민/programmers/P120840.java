/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120840
 * 시간: 0.02 ms
 * 메모리: 85.2 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120840 {
    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }
        long result = 1;
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }
        return (int) result;
    }
}
