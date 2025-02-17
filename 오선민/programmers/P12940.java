/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * 시간: 0.03 ms
 * 메모리: 89.4 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P12940 {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }

    private int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    private int lcm(int n, int m) {
        return n*m / gcd(n, m);
    }
}
