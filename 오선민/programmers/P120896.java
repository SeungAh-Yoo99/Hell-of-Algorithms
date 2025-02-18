/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120896
 * 시간:  0.87 ms
 * 메모리:  87.7 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P120896 {
    public String solution(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) +1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                answer.append(entry.getKey());
            }
        }

        if (answer.length() == 0) return "";

        char[] charArray = answer.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
