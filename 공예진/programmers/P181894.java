//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181894
//시간: 15.86ms
//메모리: 102MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                index.add(i);
            }
        }

        if (index.size() >= 2) {
            for (int i = index.get(0); i <= index.get(index.size() - 1); i++) {
                list.add(arr[i]);
            }
        } else if (index.size() == 1) {
            list.add(2);
        } else if (index.size() == 0) {
            list.add(-1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}