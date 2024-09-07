/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120803
 * 시간: 0.03 ms
 * 메모리: 71.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P120803 {
    public int solution(int num1, int num2) {
        return num1-num2;
    }

    public static void main(String[] args) {
        P120803 p = new P120803();
        System.out.println(p.solution(10,4));
    }
}
