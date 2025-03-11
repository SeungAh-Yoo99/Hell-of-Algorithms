/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 시간: 15.94 ms
 * 메모리: 69.9 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.lang.Math;

public class P12939 {
    public String solution(String s) {
        String arr[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return min + " " + max;
    }
}
