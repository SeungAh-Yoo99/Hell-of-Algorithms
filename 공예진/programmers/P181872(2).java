//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181872
//시간: 1.73ms
//메모리: 75.5MB

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx) + pat;
        return answer;
    }
}