/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 시간: 0.14 ms
 * 메모리: 89.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P12930 {
    // 풀이 1: charAt
    public String solution1(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result.append(" ");
                index = 0;
            } else {
                result.append((index++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    // 풀이 2: toCharArray
    public String solution2(String s) {
        StringBuilder result = new StringBuilder(s.length());
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                index = 0;
            } else {
                result.append((index++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        return result.toString();
    }
}
