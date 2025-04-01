//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181858
//시간: 55.19ms
//메모리: 97.5MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean exists = false;


            if (list.size() == k) {
                break;
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == num) {
                    exists = true;
                }
            }

            if (!exists) {
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