// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587?language=java
// 시간: 9.71ms
// 메모리: 82.5MB

import java.io.*;
import java.util.*;

class Solution {
    class Node {
        int num;
        boolean target;
        
        Node(int num, boolean target) {
            this.num = num;
            this.target = target;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Node> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Node(priorities[i], i == location ? true : false));
        }
        
        Node cur;
        Node max;
        while (!q.isEmpty()) {
            cur = q.poll();
            max = q.isEmpty() ? cur 
                : Collections.max(q, Comparator.comparingInt(n -> n.num));
            
            if (cur.num < max.num) {
                q.offer(cur);
            } else {
                if (cur.target) break;
                answer++;
            }
        }
        return answer;
    }
}
