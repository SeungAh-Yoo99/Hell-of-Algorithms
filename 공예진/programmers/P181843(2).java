//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181843
//시간: 0.04ms
//메모리: 88MB

class Solution {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}