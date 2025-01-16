//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/154539
//시간: 99.39ms
//메모리: 195MB

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 배열의 첫 번째 원소 인덱스를 먼저 넣는다.

        for (int i = 1; i < numbers.length; i++) {

            // 스택의 가장 위에 있에 있는 인덱스에 해당하는 배열값이 현재 인덱스의 값보다 작다면 answer에 저장
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            // 현재 인덱스를 스택
            stack.push(i);
        }

        // 스택에 자신만 남은 경우
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}