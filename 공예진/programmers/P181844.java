//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181844
//시간: 0.18ms
//메모리: 85.2MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < delete_list.length; i++) {
            map.put(delete_list[i], 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.getOrDefault(arr[i], 0) == 0) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}