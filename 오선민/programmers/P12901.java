/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12901
 * 시간: 0.03 ms
 * 메모리: 81.9 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P12901 {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE" ,"WED"};

        for (int i = 0; i < a; i++) {
            b += month[i];
        }

        return day[b%7];
    }
}
