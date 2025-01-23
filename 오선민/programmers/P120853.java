/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120853
 * 시간: 0.16ms
 * 메모리: 85.1MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;
import java.util.*;

public class P120853 {
    // 기본 풀이방법
    public int solution(String s) {
        String arr[] = s.split(" ");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                result -= Integer.parseInt(arr[i-1]);
            } else {
                result += Integer.parseInt(arr[i]);
            }
        }

        return result;
    }

    // 스택을 사용한 방법
    public int solution2(String s) {
        String arr[] = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String str : arr) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        int result = 0;
        for (int n: stack) {
            result += n;
        }

        return result;
    }
}
