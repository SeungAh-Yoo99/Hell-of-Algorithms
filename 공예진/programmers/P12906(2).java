//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
//시간: 3.20ms
//메모리: 79.6MB

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                int stackNum = stack.peek();
                if (stackNum != num) {
                    list.add(stack.pop());
                    stack.push(num);
                }
            }
        }

        if (stack.size() == 1) {
            list.add(stack.pop());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}