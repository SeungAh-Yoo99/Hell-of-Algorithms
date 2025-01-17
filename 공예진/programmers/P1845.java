//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1845
//시간: 3.52ms
//메모리: 91.6MB

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int size = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i< nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() < size) {
            return set.size();
        } else {
            return size;
        }
    }
}