/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/82612
 * 시간: 0.14 ms
 * 메모리: 74.2 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P82612 {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += price*i;
        }

        if (totalPrice - money > 0) {
            return totalPrice - money;
        } else {
            return 0;
        }
    }
}
