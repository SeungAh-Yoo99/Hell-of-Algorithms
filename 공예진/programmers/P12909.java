//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12909
// 시간: 0.64ms
// 메모리: 89MB

import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() && c == '(') {
                stack.push(c);
            } else if (stack.isEmpty() && c == ')') {
                return false;
            } else {
                char top = stack.peek();
                if ((top == '(') && (c == ')')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}