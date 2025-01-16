//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12980
//시간: 0.03ms
//메모리: 87.1MB

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
       
        while(n >= 1){ // 1보다 클때 까지 반복
            if(n%2 == 0){
                n /= 2; // 짝수라면 반 나누고 순간 이동 했다고 설정
                continue;
            }
            n--; // 홀수라면 -1 하고 
            ans++; // 건전지 1 사용했다 설정
        }
        return ans;
    }
}
