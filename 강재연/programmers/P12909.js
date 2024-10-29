// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12909
// 시간: 0.05ms
// 메모리: 33.6MB

function solution(s){
    let balance = 0;
    [...s].forEach((b, i) => {
        if(balance < 0) return false;
        
        if(b == "(") balance++;
        else balance --;
    });
    
    if(balance == 0) return true;
    else return false;
}
