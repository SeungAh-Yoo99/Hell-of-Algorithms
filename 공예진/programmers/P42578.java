//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42578
//시간: 0.12ms
//메모리: 87.1MB

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String name = cloth[0];
            String category = cloth[1];
            if (map.containsKey(category)) {
                map.get(category).add(cloth[0]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(cloth[0]);
                map.put(cloth[1], list);
            }
        }

        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            int size = map.get(iter.next()).size();
            answer *= (size + 1);
        }

        return answer - 1;
    }
}