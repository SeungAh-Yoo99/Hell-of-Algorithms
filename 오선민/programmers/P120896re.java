/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120896
 * 시간: 0.06 ms
 * 메모리: 72.4 MB
 * 승드백 반영: char 타입은 아스키 코드를 활용해서 배열의 인덱스로도 사용할 수 있는데요~!
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120896re {
    public String solution(String s) {
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            arr[c-'a']++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                char c = (char) (i+'a');
                result.append(c);
            }
        }
        return result.toString();
    }
}
