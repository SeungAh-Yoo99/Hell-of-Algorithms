/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120868
 * 시간: 0.04 ms
 * 메모리: 83.7 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120868 {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];
        int diff = (sides[0] > sides[1]) ? (sides[0] - sides[1]) : (sides[1] - sides[0]);
        int count = 0;
        for (int i = diff+1; i < sum; i++) {
            count++;
        }
        return count;
    }
}
