// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120891
// 시간: 0.05 ms
// 메모리: 33.4 MB

function solution(order) {
    let answer = 0;
    [...String(order)].forEach((num)=>{
        if(num == '3' || num == '6' || num == '9') answer++;
    });
    return answer;
}
