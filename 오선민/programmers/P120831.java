/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120831
 * 시간: 0.05 ms
 * 메모리: 72 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120831 {
    public int solution(int n) {
        int result = 0;
        for (int i = n; i>0; i--) {
            if (i%2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P120831 p = new P120831();
        System.out.println(p.solution(9));
    }
}
