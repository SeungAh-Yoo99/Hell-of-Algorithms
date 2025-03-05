/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * 시간:  0.02 ms
 * 메모리:  79.5 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);
        return new int[]{numer/gcd, denom/gcd};
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } return a;
    }
}
