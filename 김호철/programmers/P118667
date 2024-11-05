//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/118667
//시간: 92.79ms
//메모리: 161MB


import java.util.*;

// 큐 두개를 만들어
// 큐의 합들을 비교하면서
// 합이 더 큰 큐에서 빼서 작은 수에 넣으면서
// 진행했음.

// 처음엔 투 포인터를 이용해서 필요한 값들의 시작 인덱스와 끝 인덱스를 찾았지만
// 최소 횟수를 구하는 방법을 찾을 수 없어(너무 수학적으로 빡세서 ㅜㅡㅜ)
// 조금 멍청(?)하게 직접 왔다갔다 하면서 풀어봤는데 풀리네요
// 문제를 너무 어렵게만 생각하면 안 될 것 같습니다!

class Solution {

    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sumQ1 = 0 , sumQ2 = 0; // long으로 안하고 int로 하니 반례 생김 ㅜㅡㅜ
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>(); // 큐 두개 만들어서
        
        for(int i = 0 ; i < queue1.length; i++){
            q1.add(queue1[i]);       // 값을 넣으면서
            q2.add(queue2[i]);        // 큐들의 요소 합들을 구했음
            sumQ1 += queue1[i];
            sumQ2 += queue2[i];
        }
        
        while(true){
            if(answer > queue1.length *4){ // 여기서도 처음에 *2 했다가 반례가 생겼었음
                return -1;                // 만약 *4 이상 되면 없다고 판별하고 -1 리턴
            }
            if(sumQ1 == sumQ2){ // 같으면 멈췄음
                break;
            }
            if(sumQ1 > sumQ2){         // 큐 값이 큰 것에서 제일 앞의 요소를 빼서
                int temp = q1.poll();    // 다른 큐에 넣었음
                q2.add(temp);
                sumQ1 -= temp;
                sumQ2 += temp;
                answer++;
                continue;
            }
            else if(sumQ1 < sumQ2){
                int temp = q2.poll();
                q1.add(temp);
                sumQ1 += temp;
                sumQ2 -= temp;
                answer++;
                continue;
            }
        }

        return answer;
    }
}
