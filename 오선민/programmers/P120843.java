/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120843?language=java
 * 시간: 0.05 ms
 * 메모리: 80.9 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120843 {
    public int solution(int[] numbers, int k) {
        int count = 1; // 이미 numbers[0]이 선택된 채로 공 던지기를 시작하므로
        int idx = 0;
        int i = 0;

        while (count < k) {
            i += 2;
            idx = i % numbers.length;
            count++;
        }

        return numbers[idx];
    }
}
