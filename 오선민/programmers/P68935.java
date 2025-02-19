/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68935
 * 시간: 0.07 ms
 * 메모리: 77.7 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n >= 3) {
            sb.append(n%3);
            n /= 3;
        }
        sb.append(n);
        return Integer.parseInt(sb.toString(), 3);
    }
}
