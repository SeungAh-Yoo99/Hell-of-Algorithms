//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12914
//시간: 0.19ms
//메모리: 81.4MB

class Solution {
    public long solution(int n) {
        if(n==1) return 1; // 먼저 제외
        if(n==2) return 2; // 했음
        int[] jump = new int[n];
        
        jump[0]=1; 
        jump[1]=2;
        
        for(int i =2 ; i<n;i++){
            jump[i]= (jump[i-1]+jump[i-2])%1234567;
        }
        
        return jump[n-1];
    }
}
