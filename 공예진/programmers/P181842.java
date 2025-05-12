//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181842
//시간: 0.03ms
//메모리: 91.6MB

class Solution {
    public int solution(String str1, String str2) {
        if (str2.contains(str1)) {
            return 1;
        }
        return 0;
    }
}