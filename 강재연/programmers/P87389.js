// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 시간: 0.05 ms
// 메모리: 33.4 MB

function solution(n) {
    for (let x = 2; x < n; x++) {
        if (n % x == 1) {
            return x;
        }
    }
}
