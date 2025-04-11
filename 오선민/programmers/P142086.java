/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * 시간: 0.71 ms
 * 메모리: 91.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.Arrays;

public class P142086 {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charIndex = c-'a';
            result[i] = (lastIndex[charIndex] == -1) ? -1 : i-lastIndex[charIndex];
            lastIndex[charIndex] = i;
        }

        return result;
    }
}
