//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181854
//시간: 0.04ms
//메모리: 81.6MB

class Solution {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        if (size % 2 != 0) {
            for (int i = 0; i < arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for (int i = 1; i < arr.length; i+=2) {
                arr[i] += n;
            }
        }

        return arr;
    }
}