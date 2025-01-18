//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576
//시간: 1.29ms
//메모리: 84.4MB

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < completion.length; i++) {
            set.add(completion[i]);
            cnt++;
            if (set.size() == cnt) {
                map.put(completion[i], 1);
            } else {
                map.put(completion[i], map.get(completion[i]) + 1);
                cnt--;
            }
        }

        int size = set.size();
        for (int i = 0; i < participant.length; i++) {
            set.add(participant[i]);

            if (set.size() == size) {
                if (map.get(participant[i]) != 1) {
                    map.put(participant[i], map.get(participant[i]) - 1);
                } else {
                    set.remove(participant[i]);
                    size--;
                }
            } else {
                size++;
            }
        }

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            answer = iter.next().toString();
        }

        return answer;
    }
}