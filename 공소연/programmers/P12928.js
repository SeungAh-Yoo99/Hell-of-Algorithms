// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12928
// 시간: 0.30ms
// 메모리: 33.5MB

function solution(n) {
    const answer = [];
    for (let i = 1; i <= n; i++) {
        n % i === 0 && answer.push(i);
    }
    return answer.reduce((acc, cur) => acc + cur, 0);
}
