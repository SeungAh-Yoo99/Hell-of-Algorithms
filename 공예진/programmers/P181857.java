//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181857
//시간: 0.03ms
//메모리: 75MB

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size = arr.length;
        int num = 1;
        while (true) {
            if (size > num) {
                num *= 2;
            } else {
                break;
            }
        }

        answer = new int[num];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}