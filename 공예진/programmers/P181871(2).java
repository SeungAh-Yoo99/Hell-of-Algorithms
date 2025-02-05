//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181871
//시간: 0.58ms
//메모리: 88.4MB

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}