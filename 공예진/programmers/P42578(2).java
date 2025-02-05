//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42578
//시간: 0.15ms
//메모리: 82.5MB

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String category = cloth[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }

        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            answer *= (map.get(iter.next()) + 1);
        }

        return answer - 1;
    }
}