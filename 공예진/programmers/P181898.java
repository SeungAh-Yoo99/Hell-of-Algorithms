//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181898
//시간: 0.02ms
//메모리: 78.9MB

class Solution {
    public int solution(int[] arr, int idx) {

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}