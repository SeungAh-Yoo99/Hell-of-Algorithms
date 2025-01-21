//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/154539
//시간: 34.26ms
//메모리: 210MB


import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Arrays.fill(answer,-1);
        int number;
        int bigNumber;

        for(int i = len-2 ; i>=0;i--){ // 마지막은 항상 -1이기 때문에 마지막 전꺼부터 탐색
            
            for(int j = i+1; j<len; j++){ // 뒤에서부터 한 칸 뒤 비교시작
                
                if(numbers[i] <numbers[j]){
                    answer[i] = numbers[j];// 더 크면 저장후  break
                    break;
                }
                
                else if(numbers[i] >= numbers[j]){ //작거나 같을 때
                    if(answer[j] == -1){
                        answer[i] = -1;  //오른쪽게 -1이라면 더이상 큰 게 없을것이기 때문에
                        break;          // 이 수도 -1을 넣고 반환(비교 줄일 수 있음)
                    }
                    else if(numbers[i] < answer[j]){
                        answer[i] = answer[j]; // 저장하고 탈출
                        break;
                    }
                }
                
            }
        }
        
        return answer;
    }
}
