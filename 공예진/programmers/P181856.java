//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181856
//시간: 0.03ms
//메모리: 75.1MB

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        boolean flag = false;
        int sum1 = 0;
        int sum2 = 0;

        if (length1 == length2) {
            flag = true;
            for (int i = 0; i < length1; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
        }

        if (sum1 == sum2 && flag) {
            answer = 0;
        } else if ((sum1 > sum2 && flag) || (length1 > length2 && !flag)) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}