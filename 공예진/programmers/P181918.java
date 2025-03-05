//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181918
//시간: 34.72ms
//메모리: 83.3MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
        }

        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }

        return answer;
    }
}