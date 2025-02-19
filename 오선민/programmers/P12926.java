/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * 시간: 1.93 ms
 * 메모리: 80.2 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P12926 {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder(s.length());
        for (char c: s.toCharArray()) {
            if (c == ' ') result.append(c);
            else {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char)((c-base+n)%26+base));
            }
        }
        return result.toString();
    }
}
