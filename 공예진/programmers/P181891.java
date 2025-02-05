//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181891
//시간: 0.09ms
//메모리: 86MB

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] secondArr = Arrays.copyOfRange(num_list, n, num_list.length); // n + 1번째 원소 부터
        int[] firstArr = Arrays.copyOfRange(num_list, 0, n); // n번째 원소까지

        List<Integer> secondList = new ArrayList();
        for (int i = 0 ; i < secondArr.length; i++) {
            secondList.add(secondArr[i]);
        }

        List<Integer> firstList = new ArrayList();
        for (int i = 0; i < firstArr.length; i++) {
            firstList.add(firstArr[i]);
        }

        secondList.addAll(firstList);

        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = secondList.get(i);
        }

        return answer;
    }
}