//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181908
//시간: 0.11ms
//메모리: 85.7MB

import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < my_string.length(); i++) {
            map.put(my_string.substring(i), 1);
        }

        return map.getOrDefault(is_suffix, 0);
    }
}