/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 시간: 5.80 ms
 * 메모리: 95.4 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;
import java.util.*;
import java.lang.Math;

public class P86491 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }
        return maxWidth * maxHeight;
    }
}
