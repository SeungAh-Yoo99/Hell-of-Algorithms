//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/176963
//시간: 1.83ms
//메모리: 104MB

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            String n = name[i];
            int score = yearning[i];
            map.put(n, score);
        }

        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String n = photo[i][j];
                int score = map.getOrDefault(n, 0);
                sum += score;
            }
            answer[i] = sum;

        }
        return answer;
    }
}