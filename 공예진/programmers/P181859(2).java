//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181859
//시간: 55.29ms
//메모리: 144MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                i++;
            } else if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i++]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[answer.length - 1 - j] = stack.pop();
        }

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}