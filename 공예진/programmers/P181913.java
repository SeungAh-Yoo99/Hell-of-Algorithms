//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181913
//시간: 76.98ms
//메모리: 129MB

class Solution {
    public String solution(String my_string, int[][] queries) {

        String answer = my_string;
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            String reversed = "";
            for (int i = e; i >= s; i--) {
                reversed += answer.charAt(i);
            }

            answer = answer.substring(0, s) + reversed + answer.substring(e+1, my_string.length());
        }

        return answer;
    }
}