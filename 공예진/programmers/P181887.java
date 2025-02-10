//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181887
//시간: 0.03ms
//메모리: 88.5MB

class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        return oddSum > evenSum ? oddSum : evenSum;
    }
}