/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 시간: 5.19 ms
 * 메모리: 89 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P68644 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int len = numbers.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] result = set.stream().sorted().mapToInt(i -> i).toArray();
        return result;
    }
}
