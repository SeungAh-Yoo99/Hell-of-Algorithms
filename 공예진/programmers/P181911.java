//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181911
//시간: 1.85ms
//메모리: 88.6MB

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            answer += my_strings[i].substring(s, e+1);
        }
        return answer;
    }
}