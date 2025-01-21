// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12909
// 시간: 21.15ms
// 메모리: 88.4MB

import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }
        
        int count = 0;
        while (!stack.isEmpty()) {
            char pop = stack.pop();
            
            if (pop == '(') {
                count++;
            } else {
              // 괄호가 열리기 전에 닫히면 false
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }
        }

      // 열린 괄호가 모두 닫혔는지 검사
        return count == 0;
    }
}
