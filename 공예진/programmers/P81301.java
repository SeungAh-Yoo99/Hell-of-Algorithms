//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/81301
//시간: 13.47ms
//메모리: 75.3MB

import java.util.*;

class Solution {
    public int solution(String s) {
        String str = "";
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                word += s.charAt(i);

                int num = map.getOrDefault(word, -1);
                if (num != -1) {
                    str += num;
                    word = "";
                }
            } else {
                str += Character.toString(ch);
            }
        }

        int answer = Integer.parseInt(str);
        return answer;
    }
}