//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12945
//시간: 7.10ms
//메모리: 38.9MB

function solution(n) {
    let f = [0, 1]
    
    for(let i=2; i<=n; i++){  
         f[i] = (f[i-2]+f[i-1])%1234567    
    }
   
    return f[n]
}
