//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181871
//시간: 0.19ms
//메모리: 69.3MB

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int length = pat.length();
        for (int i = 0; i <= myString.length() - length; i++) {
            if (pat.equals(myString.substring(i, i + length))) {
                answer++;
            }
        }
        return answer;
    }
}