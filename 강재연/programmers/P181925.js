// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181925
// 시간: 2.26ms
// 메모리: 36.8MB

function solution(numLog) {
    let answer = '';
    let before = numLog[0];
    
    numLog.forEach((num)=>{
        if(before - num == -1) answer += 'w';
        else if(before - num == 1) answer += 's';
        else if(before - num == -10) answer += 'd';
        else if(before - num == 10) answer += 'a';
        
        before = num;
    });
    
    return answer;
}
