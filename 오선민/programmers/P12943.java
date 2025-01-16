/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * 시간: 0.04 ms
 * 메모리: 69.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P12943 {
    public int solution(int num) {
        return collatzResult(num);
    }

    private static int collatzResult(int num) {
        int count = 0;
        while (count <= 500) {
            if (num == 1) {
                break;
            }
            count++;
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = num*3 +1;
            }
        }

        if (count >= 500 && num != 1) {
            count = -1;
        }

        return count;
    }
}
