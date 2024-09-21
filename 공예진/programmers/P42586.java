//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
//시간: 0.59ms
//메모리: 77.3MB

import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int N = progresses.length;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int num = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

            // queue.peek() : 가장 먼저 들어온 값 리턴 (없으면 null 리턴)
            if (!queue.isEmpty() && queue.peek() < num) {
                list.add(queue.size());
                queue.clear();
            }
            queue.add(num);
        }
        list.add(queue.size());

        int[] arr = new int[list.size()];

        // list -> arr
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}