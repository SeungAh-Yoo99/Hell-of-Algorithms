//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
//시간: 0.33ms
//메모리: 74.2MB

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                if (stack.peek() != num) {
                    stack.push(num);
                }
            }
        }

        int size = stack.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[size - 1 - i] = stack.pop();
        }

        return answer;
    }
}