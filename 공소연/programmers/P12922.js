// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=javascript
// 시간: 17.81ms
// 메모리: 36.9MB

function solution(n) {
    let answer = [];
    
    Array.from({length: n}, (_, idx) => idx + 1)
        .forEach(item => item % 2 === 0 ? answer.push("박") : answer.push("수"));
    
    return answer.join("");
}
