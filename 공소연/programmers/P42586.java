// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
// 시간: 1.91ms
// 메모리: 77.4MB

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new TreeMap<>();
        int length = speeds.length;
        int[] deploy = new int[length];
        int work;
        
        for (int i = 0; i < length; i++) {
            work = (int) Math.ceil((float) (100 - progresses[i]) / speeds[i]);
            deploy[i] = i > 0 ? Math.max(deploy[i - 1], work) : work;
            map.put(deploy[i], map.getOrDefault(deploy[i], 0) + 1);
        }
        
        int[] answer = new int[map.size()];
        int idx = 0;
        for (Integer key : map.keySet()) {
            answer[idx++] = map.get(key);
        }
        
        return answer;
    }
}
