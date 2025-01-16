문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java
시간: 5.59ms
메모리: 86.3MB

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
          // 실패율과 인덱스값 매치
          double[][] result = new double[N][2];
          // 분자값
          int[] arr = new int[N];
          // 분모값 계산을 위한 sum
          int sum = 0;
          // 정답
          int[] answer = new int[N];
        
         // 분자값
         for(int i=0; i<stages.length; i++){
             if(stages[i] != N+1){
                arr[stages[i]-1]++; 
              }
          }
        
        // 실패율 계산
         for(int i=0; i<result.length; i++){
             if(stages.length-sum > 0){
               result[i][0] = (double)arr[i]/(stages.length-sum);        
             }else{
                 result[i][0] = 0;
             }
              result[i][1] = i+1;
              sum += arr[i];
        }

        // 람다식을 이용할 내림차순 정렬을 위해 Double[][]로 교체 
        Double[][] boxedResult = new Double[N][2];
        for (int i = 0; i < N; i++) {
            boxedResult[i][0] = result[i][0];
            boxedResult[i][1] = result[i][1];
        }

        Arrays.sort(boxedResult, (a,b) -> Double.compare(b[0],a[0]));
    
        // 정답을 출력하기 위해 2차원 배열에서 인데스값만 추출
        for(int i=0; i<N; i++){
           answer[i] = boxedResult[i][1].intValue();
        }
        
        return  answer;
        
    }
}
