// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181835
// 시간: 0.04 ms
// 메모리: 33.5 MB

function solution(arr, k) {
    return arr.map( num => (k%2 == 0 ? num+k : num *k));
}
