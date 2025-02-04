/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=java
 * 시간:  0.69 ms
 * 메모리:  72.1 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P12917 {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }
}
