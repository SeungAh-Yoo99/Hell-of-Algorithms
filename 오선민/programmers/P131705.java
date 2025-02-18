/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131705
 * 시간: 0.05 ms
 * 메모리: 85.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P131705 {
    public int solution(int[] number) {
        int count = 0;
        int n = number.length;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int target = -(number[i] + number[j]);
                for (int k = j+1; k < n; k++) {
                    count += (number[k] == target) ? 1 : 0;
                }
            }
        }

        return count;
    }
}
