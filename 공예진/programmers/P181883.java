//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181883
//시간: 2.72ms
//메모리: 81.8MB

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }
}