//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181867
//시간: 4.82ms
//메모리: 81MB

import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");

        int[] answer;
        if (myString.charAt(myString.length() - 1) == 'x') {
            answer = new int[arr.length + 1];
        } else {
            answer = new int[arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }

        return answer;
    }
}