//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181896
//시간: 0.05ms
//메모리: 73.2MB

class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}