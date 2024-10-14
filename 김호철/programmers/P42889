// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42889#

import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] fail = new Double[N+1]; //인덱스 값 맞춰주고 싶어서 크기 +1 했음
        fail[0]=-1.0; //0번 인덱스는 사용 안할꺼라서 음수로 값 던져줫음
        List<Double> failList = new ArrayList<>(N+1);
        failList.add(-1.0);//마찬가지
        int[] playerAt = new int[N+2];//플레이어가 다 통과하면 값 +1이라서 설정
        int temp = 0;
        int total = stages.length; //총 게이머 수
        for(int i = 0 ;i<stages.length;i++){
            temp = stages[i];
            playerAt[temp]++;
        }   
        for(int i = 1 ; i<fail.length;i++){
            if(total==0){
                failList.add(0.0); // 분모가 0이 되면 NaN이 들어가기 때문에
                fail[i] = 0.0;     // 예외 처리 했음
                continue;
            }
            fail[i] = (double)playerAt[i]/total;
            failList.add(fail[i]);
            total=total-playerAt[i];
        }
        Arrays.sort(fail, Collections.reverseOrder());
        for(int i = 0;i<N;i++){            
            answer[i]=failList.indexOf(fail[i]); // 첫번째로 만나는 value값임.
            failList.set(answer[i],-1.1); // 더 참조 안되게 음수로 바꿨음.
        }
        return answer;
    }
}
