// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
// 시간: 89.88ms
// 메모리: 97.6MB

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // one not in completion but in participant
        // max nlogn
        Map<String, Integer> completionMap = new HashMap<>();
        for (String com : completion) {
            completionMap.put(com, completionMap.getOrDefault(com, 0) + 1);
        }
        
        for (String par : participant) {
            if (completionMap.getOrDefault(par, 0) == 0) {
                answer = par;
                break;
            } else {
                completionMap.put(par, completionMap.get(par) - 1);
            }
        }
        return answer;
    }
}
