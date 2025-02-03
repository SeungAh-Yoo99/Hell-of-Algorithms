//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181866
//시간: 43.09ms
//메모리: 85.6MB

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(x -> !x.equals("")).sorted().toArray(String[]::new);
    }
}