//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
//시간: 0.49ms
//메모리: 81.6MB


import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] arr = new int[speeds.length];
        int cnt = 0;

        for(int i = 0 ; i< progresses.length;i++){
            arr[i]=(int)Math.ceil((double)(100-progresses[i])/speeds[i]);
            //완료 날짜 배열 생성(형변환 해야 올림으로 잘 들어감)
            // 형변환 안한다면 소숫점 아래 버리기 때문에 올림하기 전에도 double형으로 해야함
        }

        Queue<Integer> q = new LinkedList<>(); // 큐에 한번에 배포될 수 넣을 예정

        int point = arr[0]; // point 기준으로 더 크면 멈추고, 쌓인만큼 큐에 삽입
										        // point 기준으로 작으면 cnt 올림.

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>point){
                q.offer(cnt);      //배포날짜가 길다면
                point = arr[i];   // 포인트 바꾸고, cnt 큐에 삽입
                cnt = 0;         // cnt 0 으로 초기화
            }
            cnt++;
        }
        if(cnt!=0){
            q.offer(cnt); //쌓여있는 cnt 마지막으로 큐에 삽입
        }

        answer = new int[q.size()];

        for(int i = 0 ; i<answer.length;i++){

        }
            answer[i]=q.poll();
        }

        return answer;
    }
}
