//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43165
//시간: 13.19ms
//메모리: 77.9MB

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            int idx = index_list[i];
            char c = my_string.charAt(idx);
            answer += c;
        }
        return answer;
    }
}