//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181847
//시간: 0.03ms
//메모리: 75.8MB

class Solution {
    public String solution(String n_str) {
        int end = 0;
        if (n_str.charAt(0) == '0') {
            for (int i = 1; i < n_str.length(); i++) {
                if (n_str.charAt(i) != '0') {
                    end = i;
                    break;
                }
            }
        }

        return end != 0 ? n_str.substring(end) : n_str;
    }
}