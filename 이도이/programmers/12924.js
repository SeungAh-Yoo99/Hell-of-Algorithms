//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12924
//시간: 0.19ms
//메모리: 33.5MB

function solution(n) {
    let sum=1, right=1;
    var result = 0;
    
    for(let left=1; left<=n; left++){
        while(sum<n){
            right++;
            sum+=right;
        }
        
        if(sum==n) result++;
        sum -=left;       
    }
    
    return result;
}
