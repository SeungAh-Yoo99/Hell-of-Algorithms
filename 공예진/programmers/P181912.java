//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181912
//시간: 8.73ms
//메모리: 101MB

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if (num > k) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}