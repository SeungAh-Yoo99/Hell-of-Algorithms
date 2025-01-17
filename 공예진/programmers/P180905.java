//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181905
//시간: 35.20ms
//메모리: 88.1MB

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String start = my_string.substring(0, s);
        String middle = my_string.substring(s, e + 1);
        String end = my_string.substring(e + 1);
        String newM = "";
        for (int i = e; i >= s; i--) {
            newM += my_string.charAt(i);
        }

        answer += start;
        answer += newM;
        answer += end;

        return answer;
    }
}