/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * 시간: 5.28ms
 * 메모리: 93.5MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120956 {
    public int solution(String[] babbling) {
        return (int) java.util.Arrays.stream(babbling)
                .filter(b -> b.matches("^(aya|ye|woo|ma)+"))
                .count();
    }
}
