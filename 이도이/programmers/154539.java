문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/154539?language=java
시간: 144.17ms
메모리:211MB

import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        //초기값 -1로 셋팅하기
        int[] result = new int[numbers.length];
        Arrays.fill(result, -1);
        
        //뒤에 있는 값 넣어서 비교하기 위한 stack(인덱스 저장)
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            
            // stack이 비어있지 않고 현재numbers의 값보다 이전 값이 작을때 result값 변경
            while(!stack.isEmpty() && numbers[stack.peek()] < num){
                result[stack.pop()] = num;
            }
            
            stack.push(i);
        }        
        
        return result;
    }
}
