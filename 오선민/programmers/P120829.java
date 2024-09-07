/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120829
 * 시간: 0.02 ms
 * 메모리: 84.4 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P120829 {
        public int solution(int angle) {
            if (0 < angle && angle < 90) {
                return 1;
            } else if (angle == 90) {
                return 2;
            } else if (90 < angle && angle < 180) {
                return 3;
            } else {
                return 4;
            }
        }

    public static void main(String[] args) {
        P120829 p = new P120829();
        System.out.println(p.solution(90));
    }
}
