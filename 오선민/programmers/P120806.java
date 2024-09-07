/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120806
 * 시간: 0.03 ms
 * 메모리: 72.5 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120806 {
    public int solution(int num1, int num2) {
        // 형 변환
        double result = (double) num1/num2*1000;
        return (int) result;
    }

    public static void main(String[] args) {
        P120806 p = new P120806();
        System.out.println(p.solution(4, 5));
    }
}
