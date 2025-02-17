/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/77884
 * 시간: 10.94 ms
 * 메모리: 85.7 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */


package programmers;

public class P77884 {

    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += countDivisor(i);
        }
        return result;
    }

    private int countDivisor(int n) {
        int count = 0;
        if (n == 1) {
            return -1;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return (count % 2 == 0) ? n : -n;
        }
    }
}
