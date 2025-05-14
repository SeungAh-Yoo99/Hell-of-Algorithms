/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/134240
 * 시간: 15.20 ms
 * 메모리: 75.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }

        String result = sb.toString() + "0";
        result += sb.reverse().toString();
        return result;
    }
}
