/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120885
 * 시간: 0.04ms
 * 메모리: 89.3MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120885 {
    public String solution(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }
}
