//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181859
//시간: 51.93ms
//메모리: 142MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }

        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}