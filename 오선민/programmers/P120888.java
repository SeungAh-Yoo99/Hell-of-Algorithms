/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120888?language=java
 * 시간: 0.19ms
 * 메모리: 72.1MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120888 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
