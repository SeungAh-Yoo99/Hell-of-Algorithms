// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12910
// 시간: 18.92ms
// 메모리: 36.6MB

function solution(arr, divisor) {
    let answer = arr.filter(item => item % divisor === 0).sort((a, b) => a - b);
    if (answer.length === 0) answer.push(-1);
    return answer;
}
