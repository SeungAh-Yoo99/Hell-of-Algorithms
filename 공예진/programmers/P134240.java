//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/134240
//시간: 32.63ms
//메모리: 101MB

import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < food.length; i++) {
            if (food[i] > 1) {
                System.out.println("food[" + i + "] = " + food[i]);
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += i;
                    stack.push(i);
                }
            }
        }

        answer += 0;

        while (!stack.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                answer += stack.pop();
            }
        }

        return answer;
    }
}