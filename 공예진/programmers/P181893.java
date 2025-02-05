//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181893
//시간: 154.01ms
//메모리: 79.4MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                for (int j = list.size() - 1; j > query[i]; j--) {
                    list.remove(j);
                }
            } else {
                for (int j = query[i] - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}