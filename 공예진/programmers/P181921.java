//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181921
//시간: 34.92ms
//메모리: 94.9MB

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                boolean flag = true;
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != '5' && s.charAt(j) != '0') {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    list.add(i);
                }
            }

        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}