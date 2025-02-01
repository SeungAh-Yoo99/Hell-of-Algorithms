// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181926
// 시간: 0.75ms
// 메모리: 36.3MB

function solution(n, control) {
    [...control].forEach((con)=>{
        if(con == 'w') n += 1;
        else if(con == 's') n -= 1;
        else if(con == 'd') n += 10;
        else if(con == 'a') n -= 10;
    });
    
    return n;
}
