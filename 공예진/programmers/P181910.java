//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181910
//시간: 0.02ms
//메모리: 68MB

class Solution {
    public String solution(String my_string, int n) {
        int s = my_string.length() - n;
        return my_string.substring(s);
    }
}
