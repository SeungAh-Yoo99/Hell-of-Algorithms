//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
//시간: 0.25ms
//메모리: 73.4MB

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}