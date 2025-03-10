//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181923
//시간: 4.11ms
//메모리: 78MB

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = 1000000;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (min > arr[j]) {
                        min = arr[j];
                    }
                }
            }

            if (min == 1000000) min = -1;
            answer[i] = min;
        }

        return answer;
    }
}