//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181855
//시간: 7.40ms
//메모리: 106MB

class Solution {
    public int solution(String[] strArr) {
        int[] check = new int[30];
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            int size = strArr[i].length() - 1;
            check[size]++;
            max = Math.max(max, check[size]);
        }

        return max;
    }
}