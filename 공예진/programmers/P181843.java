//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181843
//시간: 0.09ms
//메모리: 86.9MB

class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for (int i = 0; i <= my_string.length() - target.length(); i++) {
            if (my_string.charAt(i) == target.charAt(0)) {
                String str = my_string.substring(i, i + target.length());
                if (str.equals(target)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}