/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * 시간: 49.96ms
 * 메모리: 112MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P12906 {
    // 풀이 1: Stack
    public int[] solution1(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int answer[] = new int[stack.size()];
        for (int i = stack.size()-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    // 풀이 2: int[]
    public int[] solution2(int []arr) {
        int[] answer = new int[arr.length];
        int index = 0;
        answer[index++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                answer[index++] = arr[i];
            }
        }

        return Arrays.copyOf(answer, index);
    }
}
