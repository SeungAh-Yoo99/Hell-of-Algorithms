/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * 시간: 0.56 ms
 * 메모리: 76.2 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) return i;
        }
        return d.length;
    }
}
