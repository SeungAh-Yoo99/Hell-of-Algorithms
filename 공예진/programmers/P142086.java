//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/142086
//시간: 46.12ms
//메모리: 86.8MB

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = map.getOrDefault(ch, -1);
            if (num == -1) {
                answer[i] = -1;
            } else{
                answer[i] = i - map.get(ch);
            }
            map.put(ch, i);
        }
        return answer;
    }
}