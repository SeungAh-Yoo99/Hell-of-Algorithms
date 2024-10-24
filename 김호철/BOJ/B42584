// 문제 링크: https://www.acmicpc.net/problem/42584
// 시간: 64 ms
// 메모리: 11620 KB

import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0 ; i < prices.length-1;i++){
            int temp = prices[i]; // 먼저 잠시 비교 대상 값 담았음
            int cnt = 0; // 몇 초 동안 안떨어졌나
            for(int j = i+1 ; j < prices.length;j++){
                cnt++; // 우선 1초 버텼음
                if(temp > prices[j]){
                    break; // 만약 대상 값보다 작은값이 나오면 break;
                }          
            }
            answer[i]= cnt; //몇 초 버틴지 입력               
        }
        return answer;
    }
}
