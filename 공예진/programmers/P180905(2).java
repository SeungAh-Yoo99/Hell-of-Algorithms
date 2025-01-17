//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181905
//시간: 13.02ms
//메모리: 80.9MB

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        return my_string.substring(0, s) + sb + my_string.substring(e + 1);
    }
}