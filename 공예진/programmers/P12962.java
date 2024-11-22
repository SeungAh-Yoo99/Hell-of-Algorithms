//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12926?language=java
//시간: 29.25ms
//메모리: 94.6MB

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (s.charAt(i) + n > 90) {
                    answer += (char)(s.charAt(i) + n - 90 + 64);
                } else {
                    answer += (char)(s.charAt(i) + n);
                }
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) + n > 122) {
                    answer += (char)(s.charAt(i) + n - 122 + 96);
                } else {
                    answer += (char)(s.charAt(i) + n);
                }
            } else {
                answer += (char)(s.charAt(i));
            }
        }
        return answer;
    }
}