//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181873
//시간: 0.03ms
//메모리: 81.7MB

class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}