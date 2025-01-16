//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/154539
//시간: 109.11ms
//메모리: 183MB

import java.util.*;

/**
 * 리팩토링된 부분
 * - Arrays.fill(answer, -1)을 사용해서 미리 answer 배열을 -1로 채워둔다.
 * - for문에서 인덱스가 0부터 시작하도록 변경하여 stack.push(0)을 없앴다.
 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(answer, -1);

        for (int i = 0; i < numbers.length; i++) {

            // 스택의 가장 위에 있에 있는 인덱스에 해당하는 배열값이 현재 인덱스의 값보다 작다면 answer에 저장
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            // 현재 인덱스를 스택
            stack.push(i);
        }

        return answer;
    }
}