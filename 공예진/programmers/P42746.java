//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42746
//시간: 205.95ms
//메모리: 132MB

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 두 문자열을 더했을 때의 값을 비교하는 comparator 작성
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String str1 = a + b;
                String str2 = b + a;
                return str2.compareTo(str1);
            }
        });

        if (strNumbers[0].charAt(0) == '0') {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strNumbers.length; i++) {
            sb.append(strNumbers[i]);
        }


        return sb.toString();
    }
}