//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
//시간: 1.17ms
//메모리: 77.6MB

import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 동명이인의 value는 2
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 동명이인의 value만 1, 나머지는 0
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        String answer = "";

        for (String player : participant) {
            if (map.get(player) != 0) {
                answer = player;
            }
        }

        return answer;
    }
}