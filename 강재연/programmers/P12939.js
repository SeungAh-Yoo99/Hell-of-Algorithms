// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12939
// 시간: 0.12 ms
// 메모리: 33.4 MB

function solution(s) {
    const nums = s.split(" ").map(Number);
    return Math.min(...nums) + " " + Math.max(...nums);
}
