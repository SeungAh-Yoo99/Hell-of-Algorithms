//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42840
//시간: 1.57ms
//메모리: 86MB

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();

        int[][] students = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            for (int j = 0; j < answers.length; j++) {
                if (students[i][j % students[i].length] == answers[j]) {
                    cnt++;
                }
            }
            map.put(i + 1, cnt);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));

        int maxValue = map.get(keys.get(0));
        for (int key : keys) {
            if (maxValue == map.get(key)) {
                list.add(key);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}