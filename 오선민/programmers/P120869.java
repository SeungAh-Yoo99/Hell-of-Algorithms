/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120869
 * 시간: 0.05ms
 * 메모리: 77.3MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120869 {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean isMatch = true;
            for (String s : spell) {
                if (!word.contains(s)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) return 1;
        }
        return 2;
    }
}
