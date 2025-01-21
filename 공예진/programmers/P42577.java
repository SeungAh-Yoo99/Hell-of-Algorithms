//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42577
//시간: 10.61ms
//메모리: 91.7MB

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

        // Set에 추가
        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }

        for (String str : phone_book) {
            for (int j = 1; j <= str.length(); j++) {
                if (set.contains(str.substring(0, j))
                        && !str.equals(str.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}