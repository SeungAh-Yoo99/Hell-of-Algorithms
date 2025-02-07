//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181851
//시간: 0.61ms
//메모리: 85.4MB

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); // <rank, i>

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
                map.put(rank[i], i);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);
        return 10000 * map.get(arr[0]) + 100 * map.get(arr[1]) + map.get(arr[2]);
    }
}