/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/147355
 * 시간: 10.75 ms
 * 메모리: 99.1 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P147355 {
    public int solution(String t, String p) {
        int count = 0;
        int pLen = p.length();
        int tLen = t.length();
        long pValue = Long.parseLong(p); // p의 길이 <= t의 길이 <= 10000이기 때문

        for (int i = 0; i <= tLen - pLen; i++) {
            long subValue = Long.parseLong(t.substring(i, i+pLen));
            count += (subValue <= pValue) ? 1 : 0;
        }

        return count;
    }
}
