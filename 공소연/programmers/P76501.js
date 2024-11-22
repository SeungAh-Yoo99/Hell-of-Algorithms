// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/76501
// 시간: 0.17ms
// 메모리: 33.5MB

function solution(absolutes, signs) {
    let sum = 0;
    absolutes.forEach((item, index) => sum += (signs[index] ? 1 : -1) * item)
    return sum;
}
