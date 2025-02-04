// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43165

import java.util.*;
import java.io.*;

class Solution {
    int[] numbers;
    int target;
    int count;
    
    public int solution(int[] numbers, int target) { 
        this.target = target;
        this.count = 0;
        this.numbers = numbers;
        dfs(0,0);
        return count;
    }
    
    void dfs(int index,int sum){
        if(index == numbers.length){
            if(sum == target){
                count++;
            }
            return ;
        }
            
            dfs(index+1, sum+numbers[index]);
            dfs(index+1, sum-numbers[index]);
        
    }
   
}
