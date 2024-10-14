// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/154539
// 시간: 100.59ms
// 메모리: 155MB

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() <= numbers[i]) {
                    stack.pop();
                } else {
                    break;
                }
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.add(numbers[i]);
        }
        return answer;
    }
}
