//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181906
//시간: 0.05ms
//메모리: 81.6MB

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(0, i);
            if (str.equals(is_prefix)) {
                return 1;
            }
        }

        return 0;
    }
}