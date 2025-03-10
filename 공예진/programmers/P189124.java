//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181924
//시간: 0.07ms
//메모리: 88.3MB

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int cnt = arr[x];
            arr[x] = arr[y];
            arr[y] = cnt;
        }

        answer = arr;
        return answer;
    }
}