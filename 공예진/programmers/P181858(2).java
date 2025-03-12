//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181858
//시간: 15.05ms
//메모리: 82.5MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (list.size() == k) {
                break;
            }

            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}