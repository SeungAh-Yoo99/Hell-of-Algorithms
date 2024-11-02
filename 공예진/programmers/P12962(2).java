//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12926?language=java
//시간: 26.33ms
//메모리: 97.6MB

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                answer += (char)((ch - 'A' + n) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                answer += (char)((ch - 'a' + n) % 26 + 'a');
            } else {
                answer += (char) ch;
            }
        }
        return answer;
    }
}