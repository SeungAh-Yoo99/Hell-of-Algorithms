//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181855
//시간: 55.22ms
//메모리: 102MB

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            int size = strArr[i].length();
            if (map.getOrDefault(size, 0) == 0) {
                map.put(size, 1);
            } else {
                map.put(size, map.get(size) + 1);
                max = Math.max(max, map.get(size));
            }
        }

        return max;
    }
}