//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181922
//시간: 3.13ms
//메모리: 78.1MB

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }

        }
        return arr;
    }
}