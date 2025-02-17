//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587
//시간: 1.96ms
//메모리: 89.7MB

//      문제 풀이
// location(위치 값) 들을 담을 큐인 q1을 만든다.
//
// location에 맞는 우선순위들이 담긴 큐인 q2를 만든다.
//
// 우선순위 큐를만들어 높은 우선순위가 먼저 나오는 우선순위 큐 pq를 만든다.
//
// 우선순위 큐에서 poll()을 통해 값을 빼서 priority에 담았다.
//
// (이 값은 현재 가장 높은 우선순위 값이 된다.)
//
// q1과 q2에서 poll()을 통해  값을 임시로 저장한다.
//
// 임시로 저장한 q2값이 가장 높은 우선순위면 즉 priority와 같으면
//
// answer++ 하고(n번째 실행)
//
// 그 때의 p1이 location이라면 (즉 몇 번째에 나오는지 궁금한 위치)
//
// 반복을 멈추고 answer을 반환한다.


import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>(); // 0,1,2.. Location담을 큐
        Queue<Integer> q2 = new LinkedList<>(); // Location에 따른 우선순위 값 담을 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i< priorities.length;i++){
            q1.add(i);
            q2.add(priorities[i]);
            pq.add(priorities[i]);
        }

        int priority = 0; // 이번에 나올 우선순위
        int tempQ1 = 0 ,tempQ2 = 0;

        int target = -1; // 실행되는 프로세스의 위치 값
        while(target != location){
            priority = pq.poll(); // 이번에 나올 우선순위
            while(true){
                tempQ1 = q1.poll();
                tempQ2 = q2.poll();
                if(tempQ2 == priority){
                    answer++;
                    target = tempQ1;
                    break;
                }
                q1.add(tempQ1);
                q2.add(tempQ2);
            }
        }
        return answer;
    }
}
