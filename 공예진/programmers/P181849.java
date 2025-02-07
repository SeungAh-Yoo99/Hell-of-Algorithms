//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181849
//시간: 0.45ms
//메모리: 88.5MB

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] str = num_str.split("");
        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}