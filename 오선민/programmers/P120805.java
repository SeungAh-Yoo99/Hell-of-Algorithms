/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120805
 * 시간: 0.04 ms
 * 메모리: 79.1 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P120805 {
    public int solution(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        P120805 p = new P120805();
        System.out.println(p.solution(4,4));
    }
}
