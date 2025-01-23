/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120852
 * 시간: 13.21ms
 * 메모리: 74.2MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.lang.Math;
import java.util.*;

public class P120852 {
    // HashSet을 사용한 경우 (+Arrays.sort())
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            answer.add(n);
        }

        int[] result = answer.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return result;
    }

    // LinkedHashSet을 사용한 경우
    public int[] solution2(int n) {
        LinkedHashSet<Integer> answer = new LinkedHashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            answer.add(n);
        }

        int[] result = answer.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
